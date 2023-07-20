package codingdojo.neetcode.arrays_n_string;


/**
 * easy
 * url: https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {
    static int[] solution(int[] nums) {
        int inputLen = nums.length;
        int[] result = new int[2 * inputLen];
        for (int i = 0; i<inputLen; i++) {
            result[i] = nums[i];
            result[i + inputLen] = nums[i];
        }
        return result;
    }
}
