package dojo.dsa.leetcode.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class SlidingWindowMaxTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,3,-1,-3,5,3,6,7}, 3, new int[] {3,3,5,5,6,7}),
        Arguments.of(new int[] {1}, 1, new int[] {1}),
        Arguments.of(new int[] {9,7,5,3,1}, 3, new int[] {9,7,5}),
        Arguments.of(new int[] {1,3,5,7,9}, 3, new int[] {5,7,9}),
        Arguments.of(new int[] {4,4,4,4,4}, 2, new int[] {4,4,4,4}),
        Arguments.of(new int[] {-1, -3, -2, -5, -4}, 2, new int[] {-1, -2, -2, -4}),
        Arguments.of(new int[] {1, -1, 0, 5, -3, 5, 3, 6, 7}, 4, new int[] {5, 5, 5, 5, 6, 7}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int k, int[] expected) {
        assertThat(SlidingWindowMax.solution(nums, k))
            .isEqualTo(expected);
    }

}
