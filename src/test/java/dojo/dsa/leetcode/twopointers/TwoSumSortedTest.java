package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumSortedTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {-5, -2, 3, 4, 6}, 7, new int[] {2, 3}),
        Arguments.of(new int[] {2,7,11,15}, 9, new int[] {0,1}),
        Arguments.of(new int[] {1, 1, 1}, 2, new int[] {0, 2}),
        Arguments.of(new int[] {1, 1, 1}, 9, new int[] {}),
        Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
        Arguments.of(new int[] {-10, -5, 1, 6, 8}, -2, new int[] {0, 4}),
        Arguments.of(new int[] {0,2,3,3,5,7}, 6, new int[] {2, 3}),
        Arguments.of(new int[] {2,3,4}, 6, new int[] {0,2}),
        Arguments.of(new int[] {-1,0}, -1, new int[] {0,1}),
        Arguments.of(new int[] {1,2,3,4}, 3, new int[] {0,1}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int target, int[] expected) {
        assertThat(TwoSumSorted.solution(nums, target))
            .isEqualTo(expected);
    }

}
