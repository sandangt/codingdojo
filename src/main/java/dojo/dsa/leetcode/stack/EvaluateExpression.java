package dojo.dsa.leetcode.stack;

import java.util.Stack;

/**
 * hard
 * url: https://bytebytego.com/exercises/coding-patterns/stacks/evaluate-expression
 */
public class EvaluateExpression {

    public static int solution(String s) {
        int result = 0;
        int sign = 1; // +1 means positive, -1 means negative
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            }
            else if (ch == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            }
            else if (ch == '(') {
                // Push current result and sign
                stack.push(result);
                stack.push(sign);
                // Reset for new sub-expression
                result = 0;
                sign = 1;
            }
            else if (ch == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // sign before '('
                result += stack.pop(); // result before '('
            }
        }

        // Add any remaining number
        if (num != 0) {
            result += sign * num;
        }

        return result;
    }

}
