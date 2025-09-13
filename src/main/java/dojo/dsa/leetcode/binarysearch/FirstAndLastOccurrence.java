package dojo.dsa.leetcode.binarysearch;

/**
 * medium
 * url: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class FirstAndLastOccurrence {

    public static int[] solution(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        // Find the first occurrence
        result[0] = findBound(nums, target, true);

        // If the first occurrence is not found, the target is not in the array
        if (result[0] == -1) {
            return result;
        }

        // Find the last occurrence
        result[1] = findBound(nums, target, false);

        return result;
    }

    private static int findBound(int[] nums, int target, boolean isFindingFirst) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (isFindingFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

}
