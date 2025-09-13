package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class LocalMaximaTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,2,3,1}, 2),
        Arguments.of(new int[] {1,2,1,3,5,6,4}, 5),
        Arguments.of(new int[] {1, 2, 3, 4, 5}, 4),
        Arguments.of(new int[] {5,4,3,2,1}, 0),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int expected) {
        assertThat(LocalMaxima.solution(nums))
            .isEqualTo(expected);
    }

}
