package dojo.dsa.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairTest {
    @Test
    void testSolution0() {
        assertThat(ClimbingStair.solution(10)).isEqualTo(89);
    }
    @Test
    void testSolution1() {
        assertThat(ClimbingStair.solution(2)).isEqualTo(2);
    }
    @Test
    void testSolution2() {
        assertThat(ClimbingStair.solution(3)).isEqualTo(3);
    }
}
