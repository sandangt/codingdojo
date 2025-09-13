package dojo.dsa.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * medium
 * url: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class SubstrAnagrams {

    public static int[] solution(String s, String p) {
        if (s.length() < p.length()) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        // Populate pFreq for string p
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        // Initialize the first window
        for (int i = 0; i < p.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(pFreq, sFreq)) {
            result.add(0);
        }

        // Slide the window through the rest of s
        for (int i = p.length(); i < s.length(); i++) {
            // Add the new character to the window
            sFreq[s.charAt(i) - 'a']++;

            // Remove the character that is now out of the window
            sFreq[s.charAt(i - p.length()) - 'a']--;

            // Check if the current window is an anagram
            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i - p.length() + 1);
            }
        }

        // Convert List to int[]
        return result.stream().mapToInt(i -> i).toArray();
    }


}
