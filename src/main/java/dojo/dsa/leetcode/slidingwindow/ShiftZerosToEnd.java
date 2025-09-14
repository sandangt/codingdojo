package dojo.dsa.leetcode.slidingwindow;

/**
 * easy
 * url: https://leetcode.com/problems/move-zeroes/
 */
public class ShiftZerosToEnd {

    public static void solution(int[] nums) {
        int left = 0, temp;
        for (int right=0; right<nums.length; right++) {
            if (nums[right] != 0) {
                if (nums[left] != nums[right]) {
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }

}
