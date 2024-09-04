package codingdojo.neetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * medium
 * url: https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class KClosestPoints {
    record Node(int[] point, double distance) {}

    static double calcDistanceToOrigin(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }

    static int[][] solution(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<Node> heap = new PriorityQueue<>(Comparator.comparingDouble(Node::distance));
        Node node;
        for (int[] point : points) heap.offer(new Node(point, calcDistanceToOrigin(point)));
        for (int i=0; i<k; i++) {
            if(heap.isEmpty()) break;
            node = heap.poll();
            result[i] = node.point();
        }
        return result;
    }

}
