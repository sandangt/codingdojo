package dojo.dsa.leetcode.stack;

import java.util.Stack;

/**
 * hard
 * url: https://leetcode.com/problems/largest-rectangle-in-histogram
 */
public class HistogramLargestRectangle {

    public static int solution(int[] heights) {
        return solution2(heights);
    }

    private static int solution1(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        // Create new array with sentinel values (0 at start and end)
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0; // Left sentinel
        for (int i = 0; i < heights.length; i++) {
            newHeights[i + 1] = heights[i];
        }
        newHeights[newHeights.length - 1] = 0; // Right sentinel

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int height = newHeights[stack.pop()];
                int width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    private static int solution2(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            // If current height is greater than or equal to stack top, push current index
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index);
                index++;
            } else {
                // Pop the top and calculate area with popped height as smallest
                int topIndex = stack.pop();
                int height = heights[topIndex];

                // Calculate width: if stack is empty, width is current index
                // Otherwise, width is difference between current index and element below top
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }
        }

        // Pop remaining elements from stack and calculate area
        while (!stack.isEmpty()) {
            int topIndex = stack.pop();
            int height = heights[topIndex];
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    private static int solution3(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

}
