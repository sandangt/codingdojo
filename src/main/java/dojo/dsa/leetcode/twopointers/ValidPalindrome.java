package dojo.dsa.leetcode.twopointers;

import org.apache.commons.lang3.StringUtils;

/**
 * easy
 * id: ALG-22
 * url: https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    public static boolean solution(String s) {
        if (StringUtils.isBlank(s)) return true;
        int left = 0, right = s.length() - 1;
        char leftLetter, rightLetter;
        while (left < right) {
            if (!Character.isLetterOrDigit(leftLetter = s.charAt(left))) ++left;
            else if (!Character.isLetterOrDigit(rightLetter = s.charAt(right))) --right;
            else {
                if (Character.toLowerCase(leftLetter) != Character.toLowerCase(rightLetter)) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }

}
