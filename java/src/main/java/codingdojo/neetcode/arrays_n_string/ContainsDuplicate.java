package codingdojo.neetcode.arrays_n_string;

import java.util.HashSet;
import java.util.Set;


/**
 * easy
 * url: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    static boolean solution(int[] nums) {
        Set<Integer> cache = new HashSet<>();
        for (int i : nums) {
            if (cache.contains(i)) {
                return true;
            }
            cache.add(i);
        }
        return false;
    }
}
