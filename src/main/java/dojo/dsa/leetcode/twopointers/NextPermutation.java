package dojo.dsa.leetcode.twopointers;

/**
 * medium
 * url: https://leetcode.com/problems/next-permutation/
 */
public class NextPermutation {

    public static void solution(int[] nums) {
        int numsLen;
        if ((numsLen = nums.length) <= 1) return;
        // Find the largest index k such that nums[k] < nums[k + 1].
        // If no such index exists, just reverse nums and done.
        int k = numsLen - 2, l;
        while (k >= 0 && nums[k] >= nums[k+1]) k--;
        if (k >= 0) {
            // Find the largest index l > k such that nums[l] > nums[k].
            l = numsLen - 1;
            while (nums[l] <= nums[k]) l--;
            swap(nums, k, l);
        }
        reverse(nums, k+1);
    }

    private static void reverse(int[] nums, int startIdx) {
        int left = startIdx;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

}
