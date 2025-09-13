package dojo.dsa.leetcode.twopointers;

/**
 * easy
 * url: https://leetcode.com/problems/move-zeroes/
 */
public class ShiftZerosToEnd {

    public static int[] solution(int[] nums) {
        int right = 0, temp;
        for (int left=0; left<nums.length; left++) {
            if (nums[left] != 0) {
                if (nums[left] != nums[right]) {
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                right++;
            }
        }
        return nums;
    }

}
