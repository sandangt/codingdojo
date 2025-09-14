package dojo.dsa.leetcode.slidingwindow;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * hard
 * url: https://leetcode.com/problems/minimum-window-substring/
 */
public class MinWindowSubstr {

    public static String solution(String s, String t) {
        Map<Character, Integer> tCounts = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCounts.put(c, tCounts.getOrDefault(c, 0) + 1);
        }
        int required = tCounts.size();
        int formed = 0;
        int[] sCounts = new int[128]; // ASCII character frequency array

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            sCounts[rChar]++;

            if (tCounts.containsKey(rChar) && sCounts[rChar] == tCounts.get(rChar)) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lChar = s.charAt(left);
                sCounts[lChar]--;

                if (tCounts.containsKey(lChar) && sCounts[lChar] < tCounts.get(lChar)) {
                    formed--;
                }

                left++;
            }
            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }

}
