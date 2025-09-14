package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class ShiftZerosToEndTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {0, 1, 0, 3, 2}, new int[] {1, 3, 2, 0, 0}),
        Arguments.of(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5}),
        Arguments.of(new int[] {0, 0, 0, 0}, new int[] {0, 0, 0, 0}),
        Arguments.of(new int[] {0, 0, 1, 2, 3}, new int[] {1, 2, 3, 0, 0}),
        Arguments.of(new int[] {1,0}, new int[] {1, 0}),
        Arguments.of(new int[] {1,2,0,0}, new int[] {1,2,0,0}),
        Arguments.of(new int[] {0}, new int[] {0}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int[] expected) {
        ShiftZerosToEnd.solution(nums);
        assertThat(nums).isEqualTo(expected);
    }

}
