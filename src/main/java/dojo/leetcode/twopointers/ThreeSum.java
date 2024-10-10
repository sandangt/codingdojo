package dojo.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    static List<List<Integer>> solution(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int leftPtr, rightPtr;
        Set<Integer> leftSet, rightSet;
        for (int i=0; i<nums.length - 2; i++) {
            if (i != 0 && nums[i-1] == nums[i]) continue;
            leftPtr = i+1;
            rightPtr = nums.length - 1;
            leftSet = new HashSet<>();
            rightSet = new HashSet<>();
            while (leftPtr < rightPtr) {
                if (nums[leftPtr] + nums[rightPtr] + nums[i] < 0) {
                    leftPtr++;
                } else if (nums[leftPtr] + nums[rightPtr] + nums[i] > 0) {
                    rightPtr--;
                } else {
                    if (!leftSet.contains(nums[leftPtr]) && !rightSet.contains(nums[rightPtr])) {
                        result.add(List.of(nums[i], nums[leftPtr], nums[rightPtr]));
                        leftSet.add(nums[leftPtr]);
                        rightSet.add(nums[rightPtr]);
                    }
                    leftPtr++;
                    rightPtr--;
                }
            }
        }
        return result;
    }
}
