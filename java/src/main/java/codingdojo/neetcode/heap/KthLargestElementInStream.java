package codingdojo.neetcode.heap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * easy
 * url: https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
public class KthLargestElementInStream {
    public static class KthLargest {
        private final PriorityQueue<Integer> heap;
        private final Queue<Integer> store;
        private final int k;

        public KthLargest(int k, int[] nums) {
            heap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
            store = new LinkedList<>();
            this.k = k;
            for (int num : nums) heap.offer(num);
        }

        public int add(int val) {
            heap.offer(val);
            for (int i=0; i<k-1; i++) {
                store.offer(heap.poll());
            }
            int result = !heap.isEmpty() ? heap.peek() : val;
            while (!store.isEmpty()) {
                heap.offer(store.poll());
            }
            return result;
        }
    }
}
