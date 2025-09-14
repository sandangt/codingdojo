package dojo.dsa.leetcode.stack;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * easy
 * url: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
 */
public class RemoveAdjacentDup {

    public static String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

}
