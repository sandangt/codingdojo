package codingdojo.neetcode.arrays_n_string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * easy
 * url: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    static boolean solution(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
