package dojo.dsa.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * medium
 * url: https://leetcode.com/problems/generate-parentheses
 */
public class GenerateParentheses {

    public static String[] solution(int n) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        backtrack(n, 0, 0, stack, result);
        return result.toArray(new String[0]);
    }

    private static void backtrack(int n, int open, int close, Stack<Character> stack, List<String> result) {
        if (open == n && close == n) {
            // Convert stack to string
            StringBuilder sb = new StringBuilder();
            for (char c : stack) sb.append(c);
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            stack.push('(');
            backtrack(n, open + 1, close, stack, result);
            stack.pop();
        }

        if (close < open) {
            stack.push(')');
            backtrack(n, open, close + 1, stack, result);
            stack.pop();
        }
    }

}
