package dojo.leetcode.arrayhashing;

import java.util.HashSet;
import java.util.Set;

/**
 * medium
 * url: https://leetcode.com/problems/longest-consecutive-sequence
 */
public class LongestConsecutiveSequence {
    static int solution(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        int longest = 1;

        for (int i : nums) set.add(i);

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int curretNum = num;
                while (set.contains(curretNum+1)) {
                    count++;
                    curretNum++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

}
