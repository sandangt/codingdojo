package dojo.leetcode.arrayhashing;

import java.util.HashMap;
import java.util.Map;


/**
 * easy
 * url: https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {

    static boolean solution(String s, String t) {
        return solution2(s, t);
    }

    static boolean solution1(String s, String t) {
        Map<Character, Integer> sCounter = new HashMap<>();
        Map<Character, Integer> tCounter = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {
            int count = sCounter.getOrDefault(s.charAt(i), 0);
            sCounter.put(s.charAt(i), ++count);
        }
        for (int i = 0; i<t.length(); i++) {
            int count = tCounter.getOrDefault(t.charAt(i), 0);
            tCounter.put(t.charAt(i), ++count);
        }
        if (sCounter.size() != tCounter.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry : sCounter.entrySet()) {
            if (!entry.getValue().equals(tCounter.getOrDefault(entry.getKey(), 0))) {
                return false;
            }
        }
        return true;
    }

    static boolean solution2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] store = new int[26];
        for (int i=0; i<s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for (int i: store) if (i != 0) return false;
        return true;

    }

}
