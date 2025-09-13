package dojo.dsa.leetcode.binarysearch;

/**
 * medium
 * url: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
 */
public class MinRotatedSortedArr {

    public static int solution(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than the rightmost, min is in right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // Min is in left half (including mid)
                high = mid;
            }
        }
        return nums[low];
    }

}
