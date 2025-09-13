package dojo.dsa.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

class TwoSumUnsortedTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {2,7,11,15}, 9, new int[] {0,1}),
        Arguments.of(new int[] {3,2,4}, 6, new int[] {1,2}),
        Arguments.of(new int[] {3,3}, 6, new int[] {0,1}),
        Arguments.of(new int[] {3,4,5,6}, 7, new int[] {0,1}),
        Arguments.of(new int[] {4,5,6}, 10, new int[] {0,2}),
        Arguments.of(new int[] {5,5}, 10, new int[] {0,1}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int target, int[] expected) {
        assertThat(TwoSumUnsorted.solution(nums, target))
            .isEqualTo(expected);
    }

}
