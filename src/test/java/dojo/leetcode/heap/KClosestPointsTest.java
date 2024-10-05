package dojo.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KClosestPointsTest {

    @Test
    void testSolution0() {
        int[][] points = {{1,3}, {-2,2}};
        int k = 1;
        int[][] expected = {{-2,2}};
        assertThat(KClosestPoints.solution(points, k)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[][] points = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        int[][] expected = {{3,3}, {-2,4}};
        assertThat(KClosestPoints.solution(points, k)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[][] points = {{0,2}, {2,0}, {2,2}};
        int k = 2;
        int[][] expected = {{0,2}, {2,0}};
        assertThat(KClosestPoints.solution(points, k)).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int[][] points = {{0,2}, {2,0}};
        int k = 1;
        int[][] expected = {{0,2}};
        assertThat(KClosestPoints.solution(points, k)).isEqualTo(expected);
    }
}
