package dojo.dsa.leetcode.arrayhashing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


/**
 * medium
 * url: https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {

    static int[] solution(int[] nums, int k) {
        return solution1(nums, k);
    }

    // region Solution 1
    record Node(int value, int repetition) {}

    static int[] solution1(int[] nums, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.repetition(), o1.repetition()));
        Map<Integer, Integer> counter = new HashMap<>();
        Node node;
        int[] result = new int[k];

        for (int i : nums) counter.merge(i, 1, Integer::sum);
        for (var i : counter.entrySet()) pq.add(new Node(i.getKey(), i.getValue()));

        for (int i=0; i<k; i++) {
            node = pq.poll();
            result[i] = node.value();
        }
        return result;
    }
    // endregion

    // region Solution 2
    static int[] solution2(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : nums) counter.merge(num, 1, Integer::sum);
        for (int key : counter.keySet()) {
            int freq = counter.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for (int i= nums.length; i>=0; i--) {
            if (bucket[i] == null) continue;
            for (int val : bucket[i]) {
                res[index++] = val;
                if (index == k) return res;
            }
        }
        return res;
    }
    // endregion

}
