package dojo.leetcode.twopointers;


/**
 * easy
 * url: https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    static boolean solution(String s) {
        if (s.isEmpty()) return true;
        int start = 0, finish = s.length() - 1;
        char startLetter, finishLetter;
        while (start < finish) {
            if (!Character.isLetterOrDigit(startLetter = s.charAt(start))) ++start;
            else if (!Character.isLetterOrDigit(finishLetter = s.charAt(finish))) --finish;
            else {
                if (Character.toLowerCase(startLetter) != Character.toLowerCase(finishLetter)) {
                    return false;
                }
                ++start;
                --finish;
            }
        }
        return true;
    }
}
