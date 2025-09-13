package dojo.dsa.leetcode.binarysearch;

/**
 * medium
 * url: https://leetcode.com/problems/find-peak-element
 */
public class LocalMaxima {

    public static int solution(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Compare the middle element with its right neighbor
            if (nums[mid] < nums[mid + 1]) {
                // We are on a rising slope, the peak must be on the right.
                low = mid + 1;
            } else {
                // We are on a falling slope, the peak could be the current element or on the left.
                high = mid;
            }
        }

        // When low == high, we have found a peak element
        return low;
    }

}
