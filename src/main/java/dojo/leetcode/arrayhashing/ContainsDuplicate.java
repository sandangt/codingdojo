package dojo.leetcode.arrayhashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * easy
 * url: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    static boolean solution(int[] nums) {
        return solution1(nums);
    }

    static boolean solution1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }

    static boolean solution2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
