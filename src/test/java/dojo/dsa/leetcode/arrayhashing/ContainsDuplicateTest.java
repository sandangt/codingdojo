package dojo.dsa.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;


class ContainsDuplicateTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,2,3,1}, true),
        Arguments.of(new int[] {1,2,3,4}, false),
        Arguments.of(new int[] {1,1,1,3,3,4,3,2,4,2}, true),
        Arguments.of(new int[] {1,2,3,3}, true),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, boolean expected) {
        assertThat(ContainsDuplicate.solution(nums)).isEqualTo(expected);
    }

}
