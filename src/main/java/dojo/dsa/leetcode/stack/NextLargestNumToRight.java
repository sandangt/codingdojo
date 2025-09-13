package dojo.dsa.leetcode.stack;

import java.util.Stack;

/**
 * medium
 * url: https://bytebytego.com/exercises/coding-patterns/stacks/next-largest-number-to-the-right
 */
public class NextLargestNumToRight {

    public static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        // Iterate from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            // Pop elements from the stack that are not greater than the current element
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            // If the stack is not empty, the top element is the next largest
            if (!stack.isEmpty()) {
                ans[i] = nums[stack.peek()];
            } else {
                // No greater element to the right
                ans[i] = -1;
            }

            // Push the current element's index onto the stack
            stack.push(i);
        }

        return ans;
    }

}
