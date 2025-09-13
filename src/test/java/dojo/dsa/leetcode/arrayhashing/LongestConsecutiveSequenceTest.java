package dojo.dsa.leetcode.arrayhashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class LongestConsecutiveSequenceTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {100,4,200,1,3,2}, 4),
        Arguments.of(new int[] {0,3,7,2,5,8,4,6,0,1}, 9),
        Arguments.of(new int[] {2,20,4,10,3,4,5}, 4),
        Arguments.of(new int[] {0,3,2,5,4,6,1,1}, 7),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int expected) {
        assertThat(LongestConsecutiveSequence.solution(nums))
            .isEqualTo(expected);
    }

}
