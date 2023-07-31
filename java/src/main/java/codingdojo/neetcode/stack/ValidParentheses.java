package codingdojo.neetcode.stack;

import java.util.Stack;


/**
 * easy
 * url: https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char popout;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                popout = stack.pop();
                if (popout == '(' && currentChar != ')') {
                    return false;
                }
                if (popout == '{' && currentChar != '}') {
                    return false;
                }
                if (popout == '[' && currentChar != ']') {
                    return false;
                }
            }
        }
        return true;
    }
}
