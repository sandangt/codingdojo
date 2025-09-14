package dojo.dsa.leetcode.arrayhashing;

/**
 * easy
 * url: https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {

    public static int[] solution(int[] nums) {
        int[] result = new int[2 * nums.length];
        for (int i = 0; i<nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

}
