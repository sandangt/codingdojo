package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class MinRotatedSortedArrTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {3,4,5,1,2}, 1),
        Arguments.of(new int[] {4,5,6,7,0,1,2}, 0),
        Arguments.of(new int[] {11,13,15,17}, 11),
        Arguments.of(new int[] {2,3,4,5,6,7,1}, 1),
        Arguments.of(new int[] {1}, 1),
        Arguments.of(new int[] {2,1}, 1),
        Arguments.of(new int[] {5,6,7,8,9,1,2,3,4}, 1),
        Arguments.of(new int[] {10, 12, 15, -3, 0, 2, 5}, -3),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int expected) {
        assertThat(MinRotatedSortedArr.solution(nums))
            .isEqualTo(expected);
    }

}
