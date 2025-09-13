package dojo.dsa.leetcode.twopointers;

/**
 * medium
 * url: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumSorted {

    private static final int[] EMPTY = new int[] {};

    static int[] solution(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int currentSum;
        while (left < right) {
            currentSum = nums[left] + nums[right];
            if (currentSum > target) right--;
            else if (currentSum < target) left++;
            else return new int[] {left, right};
        }
        return EMPTY;
    }
}
