package dojo.dsa.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

class ConcatenationOfArrayTest {

    private final static Arguments[] testSolution = {
        Arguments.of(new int[] {1,2,1}, new int[] {1,2,1,1,2,1}),
        Arguments.of(new int[] {1,3,2,1}, new int[] {1,3,2,1,1,3,2,1}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int[] expected) {
        assertThat(ConcatenationOfArray.solution(nums)).containsExactly(expected);
    }

}
