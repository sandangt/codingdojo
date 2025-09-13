package dojo.dsa.leetcode.bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingBitsTest {
    @Test
    void testSolution0() {
        int n = 2;
        int[] expected = {0, 1, 1};
        assertThat(CountingBits.solution(n)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int n = 5;
        int[] expected = {0, 1, 1, 2, 1, 2};
        assertThat(CountingBits.solution(n)).isEqualTo(expected);
    }
}
