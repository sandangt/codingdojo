package dojo.dsa.leetcode.arrayhashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class GeometricSequenceTripletsTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {2,1,2,4,8,8}, 2, 5),
        Arguments.of(new int[] {1,2,4,8}, 2, 2),
        Arguments.of(new int[] {1,2,3,4,5}, 3, 0),
        Arguments.of(new int[] {1,1,2,2,4,4}, 2, 8),
        Arguments.of(new int[] {3,3,3,3}, 1, 4),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int r, int expected) {
        assertThat(GeometricSequenceTriplets.solution(nums, r))
            .isEqualTo(expected);
    }

}
