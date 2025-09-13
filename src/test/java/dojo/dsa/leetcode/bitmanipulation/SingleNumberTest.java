package dojo.dsa.leetcode.bitmanipulation;

import static dojo.dsa.leetcode.bitmanipulation.SingleNumber.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class SingleNumberTest {
    @Test
    void testSolution0() {
        int[] input = {2,2,1};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution1() {
        int[] input = {4,1,2,1,2};
        int output = 4;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution2() {
        int[] input = {1};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
}
