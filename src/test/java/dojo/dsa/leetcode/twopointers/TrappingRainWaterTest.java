package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class TrappingRainWaterTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}, 6),
        Arguments.of(new int[] {4,2,0,3,2,5}, 9),
        Arguments.of(new int[] {0,2,0,3,1,0,1,3,2,1}, 9),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] height, int expected) {
        assertThat(TrappingRainWater.solution(height))
            .isEqualTo(expected);
    }
}
