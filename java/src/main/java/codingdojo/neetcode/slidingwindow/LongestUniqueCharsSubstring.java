package codingdojo.neetcode.slidingwindow;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * medium
 * url: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestUniqueCharsSubstring {
    static int solution(String s) {
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        Queue<Character> queue = new ArrayDeque<>();
        int maxLen = 0;
        char currentChar;
        for (int i=0; i<s.length(); i++) {
            currentChar = s.charAt(i);
            if (!queue.contains(currentChar)) {
                queue.add(currentChar);
                maxLen = Math.max(maxLen, queue.size());
            } else {
                while (queue.contains(currentChar)) {
                    queue.poll();
                }
                queue.add(currentChar);
            }
        }
        return maxLen;
    }
}
