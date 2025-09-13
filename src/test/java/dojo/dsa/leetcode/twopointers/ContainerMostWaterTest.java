package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerMostWaterTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
        Arguments.of(new int[] {1, 1}, 1),
        Arguments.of(new int[] {1,7,2,5,4,7,3,6}, 36),
        Arguments.of(new int[] {2,2,2}, 4),
        Arguments.of(new int[] {2, 7, 8, 3, 7, 6}, 24),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] heights, int expected) {
        assertThat(ContainerMostWater.solution(heights))
            .isEqualTo(expected);
    }

}
