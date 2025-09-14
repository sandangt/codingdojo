package dojo.dsa.leetcode.stack;

import java.util.Stack;

/**
 * medium
 * url: https://leetcode.com/problems/daily-temperatures/
 */
public class DailyTemperatures {

    public static int[] solution(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        int stIdx;
        for (int i=0; i<temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[stIdx = st.peek()]) {
                st.pop();
                result[stIdx] = i - stIdx;
            }
            result[i] = 0;
            st.push(i);
        }
        return result;
    }

}
