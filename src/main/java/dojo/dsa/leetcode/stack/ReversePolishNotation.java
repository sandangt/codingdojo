package dojo.dsa.leetcode.stack;

import java.util.Stack;

/**
 * medium
 * url: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */
public class ReversePolishNotation {

    static int solution(String[] tokens) {
        Stack<String> st = new Stack<>();
        String operand1, operand2;
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    operand2 = st.pop();
                    operand1 = st.pop();
                    st.push(String.valueOf(Integer.parseInt(operand1) + Integer.parseInt(operand2)));
                }
                case "-" -> {
                    operand2 = st.pop();
                    operand1 = st.pop();
                    st.push(String.valueOf(Integer.parseInt(operand1) - Integer.parseInt(operand2)));
                }
                case "*" -> {
                    operand2 = st.pop();
                    operand1 = st.pop();
                    st.push(String.valueOf(Integer.parseInt(operand1) * Integer.parseInt(operand2)));
                }
                case "/" -> {
                    operand2 = st.pop();
                    operand1 = st.pop();
                    st.push(String.valueOf(Integer.parseInt(operand1) / Integer.parseInt(operand2)));
                }
                default -> st.push(token);
            }
        }
        return Integer.parseInt(st.pop());
    }

}
