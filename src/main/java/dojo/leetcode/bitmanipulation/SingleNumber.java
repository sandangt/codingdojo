package dojo.leetcode.bitmanipulation;


/**
 * easy
 * url: https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    static int solution(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
