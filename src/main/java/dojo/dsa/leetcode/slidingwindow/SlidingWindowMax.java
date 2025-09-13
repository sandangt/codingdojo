package dojo.dsa.leetcode.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

/**
 * hard
 * url: https://leetcode.com/problems/sliding-window-maximum/
 */
public class SlidingWindowMax {

    public static int[] solution(int[] nums, int k) {
        return solution2(nums, k);
    }

    private static int[] solution1(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Deque to store indices of array elements
        // Front of deque will always contain the index of maximum element in current window
        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices of elements smaller than current element
            // from the back of deque (they can never be maximum)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element index to deque
            deque.offerLast(i);

            // Add maximum to result when we have processed at least k elements
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    private static int[] solution2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Max heap to store elements with their indices
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1]; // If values equal, prefer later index
            return b[0] - a[0]; // Max heap based on value
        });

        // Add first k elements
        for (int i = 0; i < k; i++) {
            maxHeap.offer(new int[]{nums[i], i});
        }

        result[0] = maxHeap.peek()[0];

        // Process remaining elements
        for (int i = k; i < n; i++) {
            maxHeap.offer(new int[]{nums[i], i});

            // Remove elements outside current window
            while (!maxHeap.isEmpty() && maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }

            result[i - k + 1] = maxHeap.peek()[0];
        }

        return result;
    }

}
