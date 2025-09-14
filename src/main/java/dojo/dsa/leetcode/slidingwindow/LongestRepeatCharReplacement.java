package dojo.dsa.leetcode.slidingwindow;

/**
 * medium
 * url: https://leetcode.com/problems/longest-repeating-character-replacement/
 */
public class LongestRepeatCharReplacement {

    private static final char STARTER_CHAR = 'A';

    public static int solution(String s, int k) {
        int leftPtr = 0, maxLen = 1, windowLen, longestCharCount = 1;
        int[] charCounter = new int[26];
        for (int rightPtr=0; rightPtr<s.length(); rightPtr++) {
            charCounter[s.charAt(rightPtr) - STARTER_CHAR]++;
            longestCharCount = Math.max(longestCharCount, charCounter[s.charAt(rightPtr) - STARTER_CHAR]);
            windowLen = rightPtr - leftPtr + 1;
            if (windowLen - longestCharCount > k) {
                charCounter[s.charAt(leftPtr) - STARTER_CHAR]--;
                leftPtr++;
            }
            maxLen = Math.max(maxLen, rightPtr - leftPtr + 1);
        }
        return maxLen;
    }

}
