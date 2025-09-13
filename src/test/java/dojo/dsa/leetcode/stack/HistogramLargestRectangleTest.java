package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class HistogramLargestRectangleTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {2,1,5,6,2,3}, 10),
        Arguments.of(new int[] {2,4}, 4),
        Arguments.of(new int[] {5}, 5),
        Arguments.of(new int[] {3, 3, 3, 3, 3}, 15),
        Arguments.of(new int[] {1, 2, 3, 4, 5}, 9),
        Arguments.of(new int[] {5, 4, 3, 2, 1}, 9),
        Arguments.of(new int[] {3, 0, 2, 0, 4}, 4),
        Arguments.of(new int[] {10000, 9999, 10000}, 29997),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] heights, int expected) {
        assertThat(HistogramLargestRectangle.solution(heights))
            .isEqualTo(expected);
    }

}
