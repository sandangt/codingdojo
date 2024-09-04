package codingdojo.neetcode.stack;

import java.util.Stack;

/**
 * medium
 * url: https://leetcode.com/problems/daily-temperatures/
 */
public class DailyTemperatures {

    static int[] solution(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        int stackIdx;
        for (int i=0; i<temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[stackIdx = st.peek()]) {
                st.pop();
                result[stackIdx] = i - stackIdx;
            }
            result[i] = 0;
            st.push(i);
        }
        return result;
    }

}
