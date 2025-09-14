package dojo.dsa.leetcode.arrayhashing;

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

    public static String[][] solution(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String encodedStr = encode(str);
            List<String> lst = map.getOrDefault(encodedStr, new ArrayList<>());
            lst.add(str);
            if (!map.containsKey(str)) {
                map.put(encodedStr, lst);
            }
        }
        String[][] result = new String[map.size()][];
        String[] arr;
        int idx = 0;
        for (var it = map.values().iterator(); it.hasNext(); idx++) {
            var currentItem = it.next();
            arr = new String[currentItem.size()];
            currentItem.toArray(arr);
            result[idx] = arr;
        }
        return result;
    }

    private static String encode(String str) {
        int[] store = new int[26];
        for (int i=0; i<str.length(); i++) {
            store[str.charAt(i) - 'a']++;
        }
        return Arrays.toString(store);
    }

}
