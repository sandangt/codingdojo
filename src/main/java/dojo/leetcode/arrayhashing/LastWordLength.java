package dojo.leetcode.arrayhashing;


/**
 * easy
 * url: https://leetcode.com/problems/length-of-last-word/
 */
public class LastWordLength {
    static int solution(String s) {
        if (s.isEmpty()) return 0;
        String[] sArr = s.split(" ");
        return sArr[sArr.length - 1].length();
    }
}
