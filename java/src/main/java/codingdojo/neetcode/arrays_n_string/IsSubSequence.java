package codingdojo.neetcode.arrays_n_string;


/**
 * easy
 * url: https://leetcode.com/problems/is-subsequence/
 */
public class IsSubSequence {
    static boolean solution(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.isBlank()) return false;
        int sPointer = 0, tPointer = 0;
        while (true) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            sPointer++;
        }
    }
}
