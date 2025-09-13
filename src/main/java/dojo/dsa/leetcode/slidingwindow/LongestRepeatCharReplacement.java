package dojo.dsa.leetcode.slidingwindow;

/**
 * medium
 * url: https://leetcode.com/problems/longest-repeating-character-replacement/
 */
public class LongestRepeatCharReplacement {
    private static final char STARTER_CHAR = 'A';
    static int solution(String s, int k) {
        if (s == null || s.isEmpty()) return 0;
        int leftPtr = 0, rightPtr = 0, maxLen = 1, windowLen, longestCharCount = 1;
        int[] charMap = new int[26];
        while (rightPtr < s.length()) {
            longestCharCount = Math.max(longestCharCount, ++charMap[s.charAt(rightPtr) - STARTER_CHAR]);
            windowLen = rightPtr - leftPtr + 1;
            if (windowLen - longestCharCount > k) {
                charMap[s.charAt(leftPtr) - STARTER_CHAR]--;
                leftPtr++;
            }
            maxLen = Math.max(maxLen, rightPtr - leftPtr + 1);
            rightPtr++;
        }
        return maxLen;
    }
}
