package dojo.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerMostWaterTest {

    @Test
    void testSolution0() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        assertThat(ContainerMostWater.solution(height)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] height = {1,1};
        int expected = 1;
        assertThat(ContainerMostWater.solution(height)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] height = {1,7,2,5,4,7,3,6};
        int expected = 36;
        assertThat(ContainerMostWater.solution(height)).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int[] height = {2,2,2};
        int expected = 4;
        assertThat(ContainerMostWater.solution(height)).isEqualTo(expected);
    }

}
