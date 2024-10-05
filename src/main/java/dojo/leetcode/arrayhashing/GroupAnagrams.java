package dojo.leetcode.arrayhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * medium
 * url: https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    static List<List<String>> solution(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String encodedStr = anagramEncode(str);
            List<String> lst = map.getOrDefault(encodedStr, new ArrayList<>());
            lst.add(str);
            if (!map.containsKey(str)) {
                map.put(encodedStr, lst);
            }
        }
        return map.values().stream().toList();

    }

    static String anagramEncode(String str) {
        int[] store = new int[26];
        for (int i=0; i<str.length(); i++) {
            store[str.charAt(i) - 'a']++;
        }
        return Arrays.toString(store);
    }

}
