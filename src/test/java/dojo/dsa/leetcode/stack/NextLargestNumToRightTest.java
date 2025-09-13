package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;


class NextLargestNumToRightTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {5, 2, 4, 6, 1}, new int[] {6, 4, 6, -1, -1}),
        Arguments.of(new int[] {10, 8, 6, 4}, new int[] {-1, -1, -1, -1}),
        Arguments.of(new int[] {1, 2, 3, 4, 5}, new int[] {2, 3, 4, 5, -1}),
        Arguments.of(new int[] {4, 5, 2, 25, 7, 8}, new int[] {5, 25, 25, -1, 8, -1}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int[] expected) {
        assertThat(NextLargestNumToRight.solution(nums))
            .isEqualTo(expected);
    }

}
