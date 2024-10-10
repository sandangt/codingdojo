package dojo.leetcode.bitmanipulation;

/**
 * easy
 * url: https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOf1Bit {
    static int solution(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }
}
