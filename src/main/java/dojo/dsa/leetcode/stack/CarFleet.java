package dojo.dsa.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * medium
 * url: https://leetcode.com/problems/car-fleet/
 */
public class CarFleet {

    public static int solution(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2]; // [position, timeToTarget]

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Sort by position descending
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            // If current car takes longer, it forms a new fleet
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // Else, it joins the fleet ahead (do nothing)
        }

        return stack.size();
    }

}
