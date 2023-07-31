package codingdojo.neetcode.arrays_n_string;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/**
 * medium
 * url: https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    static class Node {
        public int repetition;
        public int value;

        public Node(int value, int repetition) {
            this.repetition = repetition;
            this.value = value;
        }
    }
    static int[] solution(int[] nums, int k) {
        int repetition;
        Node node;
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o2.repetition, o1.repetition);
        });
        int[] result = new int[k];
        for (int i : nums) {
            repetition = map.getOrDefault(i, 0);
            map.put(i, ++repetition);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            node = new Node(entry.getKey(), entry.getValue());
            pq.add(node);
        }
        for (int i = 0; i < k; i++) {
            node = pq.poll();
            result[i] = node.value;
        }
        return result;
    }
}
