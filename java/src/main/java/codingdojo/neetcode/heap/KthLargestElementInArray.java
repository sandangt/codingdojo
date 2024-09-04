package codingdojo.neetcode.heap;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * medium
 * url: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInArray {
    static int solution(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        for (int num : nums) heap.offer(num);
        for (int i=0; i<k-1; i++) heap.poll();
        return heap.poll();
    }
}
