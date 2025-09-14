package dojo.dsa.leetcode.arrayhashing;

import java.util.HashSet;
import java.util.Set;

/**
 * medium
 * url: https://leetcode.com/problems/longest-consecutive-sequence
 */
public class LongestConsecutiveSequence {

    public static int solution(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int longestCount = 1, currentCount, currentNum;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            if (!set.contains(num-1)) {
                currentCount = 1;
                currentNum = num;
                while (set.contains(currentNum+1)) {
                    currentCount++;
                    currentNum++;
                }
                longestCount = Math.max(longestCount, currentCount);
            }
        }
        return longestCount;
    }

}
