package dojo.dsa.leetcode.arrayhashing;


/**
 * easy
 * id: ALG-4
 * url: https://leetcode.com/problems/is-subsequence/
 */
public class IsSubSequence {
    public static boolean solution(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.isBlank()) return true;
        int sPtr = 0;
        for (int tPtr = 0; tPtr < t.length(); tPtr++) {
            if (s.charAt(sPtr) == t.charAt(tPtr)) sPtr++;
            if (sPtr == s.length()) return true;
        }
        return false;
    }

}
