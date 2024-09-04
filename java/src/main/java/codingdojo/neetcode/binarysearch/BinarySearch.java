package codingdojo.neetcode.binarysearch;

/**
 * easy
 * url: https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {

    static int solution(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private static int binarySearch(int[] nums, int target, int low, int high) {
        if (low > high) return -1;
        int middle = (low + high) / 2;
        if (target < nums[middle]) return binarySearch(nums, target, low, middle - 1);
        if (target > nums[middle]) return binarySearch(nums, target, middle + 1, high);
        return middle;
    }
}
