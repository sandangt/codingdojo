package codingdojo.neetcode.heap;

import java.util.PriorityQueue;


/**
 * easy
 * url: https://leetcode.com/problems/last-stone-weight/
 */
public class LastStoneWeight {
    static int solution(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> Integer.compare(i2, i1));
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            pq.add(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}
