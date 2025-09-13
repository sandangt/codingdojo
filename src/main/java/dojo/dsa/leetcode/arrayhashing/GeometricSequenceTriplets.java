package dojo.dsa.leetcode.arrayhashing;

import java.util.HashMap;
import java.util.Map;

/**
 * medium
 * url: https://bytebytego.com/exercises/coding-patterns/hash-maps-and-sets/geometric-sequence-triplets
 */
public class GeometricSequenceTriplets {

    public static int solution(int[] nums, int r) {
        int count = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int num : nums) {
            if (pairs.containsKey(num)) {
                count += pairs.get(num);
            }
            if (counts.containsKey(num)) {
                int prevCount = counts.get(num);
                pairs.put(num * r, pairs.getOrDefault(num * r, 0) + prevCount);
            }
            counts.put(num * r, counts.getOrDefault(num * r, 0) + 1);
        }
        return count;
    }

}
