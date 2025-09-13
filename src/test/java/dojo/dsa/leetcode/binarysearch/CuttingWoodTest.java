package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class CuttingWoodTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {2,6,3,8}, 7, 3),
        Arguments.of(new int[] {10,10,10}, 15, 5),
        Arguments.of(new int[] {5,5,5}, 10, 1),
        Arguments.of(new int[] {1,2,3,4,5}, 1, 4),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] heights, int k, int expected) {
        assertThat(CuttingWood.solution(heights, k))
            .isEqualTo(expected);
    }

}
