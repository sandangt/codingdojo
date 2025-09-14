package dojo.dsa.leetcode.slidingwindow;

/**
 * medium
 * url: https://leetcode.com/problems/permutation-in-string/
 */
public class StringPermutation {
    private static final char STARTER_CHAR = 'a';
    static boolean solution(String s1, String s2) {
        int[] charCounter = new int[26];
        for (int i=0; i<s1.length(); i++) charCounter[s1.charAt(i) - STARTER_CHAR]--;
        int leftPtr = 0, rightPtr = s1.length() - 1, count;
        while (rightPtr < s2.length()) {
            count = 0;
            for (int i=leftPtr; i<=rightPtr; i++) {
                if (charCounter[s2.charAt(i) - STARTER_CHAR]++ < 0) {
                    count++;
                }
            }
            if (count == s1.length()) return true;
            for (int i=leftPtr; i<=rightPtr; i++) {
                charCounter[s2.charAt(i) - STARTER_CHAR]--;
            }
            rightPtr++;
            leftPtr++;
        }
        return false;
    }
}
