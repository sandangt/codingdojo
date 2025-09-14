package dojo.dsa.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * medium
 * url: https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

    private static final int[][] EMPTY = new int[][] {};

    public static int[][] solution(int[] nums) {
        if (nums.length < 3) return EMPTY;
        Arrays.sort(nums);
        List<int[]> collector = new ArrayList<>();
        int left, right, currentSum;
        Set<Integer> leftSet, rightSet;
        for (int i=0; i<nums.length - 2; i++) {
            if (i > 0 && nums[i-1] == nums[i]) continue;
            left = i+1;
            right = nums.length - 1;
            leftSet = new HashSet<>();
            rightSet = new HashSet<>();
            while (left < right) {
                currentSum = nums[left] + nums[right] + nums[i];
                if (currentSum < 0) left++;
                else if (currentSum > 0) right--;
                else {
                    if (!leftSet.contains(nums[left]) && !rightSet.contains(nums[right])) {
                        collector.add(new int[] {nums[i], nums[left], nums[right]});
                        leftSet.add(nums[left]);
                        rightSet.add(nums[right]);
                    }
                    left++;
                    right--;
                }
            }
        }
        int[][] result = new int[collector.size()][3];
        for (int i=0; i< collector.size(); i++) result[i] = collector.get(i);
        return result;
    }

}
