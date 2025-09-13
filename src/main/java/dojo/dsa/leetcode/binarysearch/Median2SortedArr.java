package dojo.dsa.leetcode.binarysearch;

/**
 * hard
 * url: https://leetcode.com/problems/median-of-two-sorted-arrays
 */
public class Median2SortedArr {

    public static double solution(int[] nums1, int[] nums2) {
        // Ensure nums1 is the shorter array for easier binary search
        if (nums1.length > nums2.length) {
            return solution(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        int partition1, partition2;
        int left_max, right_min;

        while (low <= high) {
            partition1 = low + (high - low) / 2;
            partition2 = (m + n + 1) / 2 - partition1;

            int nums1_left = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int nums1_right = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int nums2_left = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int nums2_right = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            if (nums1_left <= nums2_right && nums2_left <= nums1_right) {
                // Correct partition found
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1_left, nums2_left);
                } else {
                    return (Math.max(nums1_left, nums2_left) + Math.min(nums1_right, nums2_right)) / 2.0;
                }
            } else if (nums1_left > nums2_right) {
                // nums1 partition is too far to the right
                high = partition1 - 1;
            } else {
                // nums1 partition is too far to the left
                low = partition1 + 1;
            }
        }
        return -1; // Should not reach here due to constraints
    }

}
