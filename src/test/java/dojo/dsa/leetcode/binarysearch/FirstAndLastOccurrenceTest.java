package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class FirstAndLastOccurrenceTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {5,7,7,8,8,10}, 8, new int[] {3,4}),
        Arguments.of(new int[] {5,7,7,8,8,10}, 6, new int[] {-1,-1}),
        Arguments.of(new int[] {}, 0, new int[] {-1,-1}),
        Arguments.of(new int[] {1, 2, 3, 4, 4}, 4, new int[] {3,4}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int target, int[] expected) {
        assertThat(FirstAndLastOccurrence.solution(nums, target))
            .isEqualTo(expected);
    }

}
