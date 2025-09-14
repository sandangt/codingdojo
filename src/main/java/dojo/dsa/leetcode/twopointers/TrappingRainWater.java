package dojo.dsa.leetcode.twopointers;

/**
 * hard
 * url: https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {

    public static int solution(int[] heights) {
        int left = 0, right = heights.length - 1;
        int leftMax = heights[left], rightMax = heights[right];
        int result = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, heights[left]);
                result += leftMax - heights[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, heights[right]);
                result += rightMax - heights[right];
            }
        }
        return result;
    }

}
