package codingdojo.neetcode.stack;

import java.util.Stack;


/**
 * easy
 * url: https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    static boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        char currentChar, popOut;
        for (int i=0; i<s.length(); i++) {
            currentChar = s.charAt(i);
            if (isOpen(currentChar)) {
                st.push(currentChar);
            } else if (isClose(currentChar)) {
                if (st.isEmpty()) return false;
                popOut = st.pop();
                if (!isSameType(popOut, currentChar)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean isSameType(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }

    private static boolean isOpen(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean isClose(char c) {
        return c == ')' || c == ']' || c == '}';
    }

}
