package dojo.dsa.leetcode.dynamicprogramming;

/**
 * easy
 * url: https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStair {
    static int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int first = 1, second = 2;
        int curr = 0;
        for (int i = 3; i<=n; i++) {
            curr = second + first;
            first = second;
            second = curr;
        }
        return curr;
    }
}
