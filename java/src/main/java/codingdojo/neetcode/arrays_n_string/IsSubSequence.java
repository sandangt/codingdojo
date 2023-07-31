package codingdojo.neetcode.arrays_n_string;


/**
 * easy
 * url: https://leetcode.com/problems/is-subsequence/
 */
public class IsSubSequence {
    static boolean solution(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.isBlank()) return true;
        int sPointer = 0, tPointer;
        for (tPointer = 0; tPointer < t.length(); tPointer++) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            if (sPointer == s.length()) {
                return true;
            }
        }
        return false;
    }
}
