package codingdojo.neetcode.arraystring;


import java.util.HashMap;
import java.util.Map;


/**
 * easy
 * url: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> ht = new HashMap<>();
        int complement;
        for (int i = 0; i < nums.length; i++) {
            if (ht.containsKey(complement = target - nums[i])) {
                return new int[] {ht.get(complement), i};
            }
            ht.put(nums[i], i);
        }
        return new int[] {};
    }
}
