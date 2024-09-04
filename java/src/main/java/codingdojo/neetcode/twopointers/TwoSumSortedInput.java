package codingdojo.neetcode.twopointers;

/**
 * medium
 * url: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumSortedInput {
    static int[] solution(int[] nums, int target) {
        int startPointer = 0, finishPointer = nums.length - 1;
        int totalVal;
        while (startPointer < finishPointer) {
            totalVal = nums[startPointer] + nums[finishPointer];
            if (totalVal == target) break;
            if (totalVal < target) {
                startPointer++;
                continue;
            }
            finishPointer--;
        }
        return new int[] {startPointer+1, finishPointer+1};
    }
}
