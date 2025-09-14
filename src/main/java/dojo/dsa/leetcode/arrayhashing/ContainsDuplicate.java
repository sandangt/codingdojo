package dojo.dsa.leetcode.arrayhashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * easy
 * id: ALG-5
 * url: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    public static boolean solution(int[] nums) {
        return solution0(nums);
    }

    private static boolean solution0(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    private static boolean solution1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }

}
