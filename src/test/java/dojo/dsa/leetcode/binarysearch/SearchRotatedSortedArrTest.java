package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class SearchRotatedSortedArrTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {4,5,6,7,0,1,2}, 0, 4),
        Arguments.of(new int[] {4,5,6,7,0,1,2}, 3, -1),
        Arguments.of(new int[] {1}, 0, -1),
        Arguments.of(new int[] {1}, 1, 0),
        Arguments.of(new int[] {6,7,8,1,2,3,4,5}, 3, 5),
        Arguments.of(new int[] {6,7,8,1,2,3,4,5}, 6, 0),
        Arguments.of(new int[] {6,7,8,1,2,3,4,5}, 5, 7),
        Arguments.of(new int[] {5,1,2,3,4}, 1, 1),
        Arguments.of(new int[] {5,1,2,3,4}, 4, 4),
        Arguments.of(new int[] {2,3,4,5,6,7,8,1}, 1, 7),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int target, int expected) {
        assertThat(SearchRotatedSortedArr.solution(nums, target))
            .isEqualTo(expected);
    }

}
