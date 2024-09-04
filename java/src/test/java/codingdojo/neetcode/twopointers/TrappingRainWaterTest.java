package codingdojo.neetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrappingRainWaterTest {
    @Test
    void testSolution0() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        assertThat(TrappingRainWater.solution(height)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] height = {4,2,0,3,2,5};
        int expected = 9;
        assertThat(TrappingRainWater.solution(height)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] height = {0,2,0,3,1,0,1,3,2,1};
        int expected = 9;
        assertThat(TrappingRainWater.solution(height)).isEqualTo(expected);
    }
}
