package dojo.dsa.leetcode.stack;

import java.util.Stack;

/**
 * medium
 * url: https://bytebytego.com/exercises/coding-patterns/stacks/next-largest-number-to-the-right
 */
public class NextLargestNumToRight {

    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        // Iterate from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            // Pop elements from the stack that are not greater than the current element
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            // If the stack is not empty, the top element is the next largest
            if (st.isEmpty()) result[i] = -1; // No greater element to the right
            else result[i] = nums[st.peek()];
            // Push the current element's index onto the stack
            st.push(i);
        }
        return result;
    }

}
