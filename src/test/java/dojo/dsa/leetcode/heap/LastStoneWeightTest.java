package dojo.dsa.leetcode.heap;

import static dojo.dsa.leetcode.heap.LastStoneWeight.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class LastStoneWeightTest {
    @Test
    void testSolution0() {
        int[] input = {2,7,4,1,8,1};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution1() {
        int[] input = {1};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution2() {
        int[] input = {2,3,6,2,4};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution3() {
        int[] input = {1,2};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
}
