package dojo.dsa.leetcode.binarysearch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;


class BinarySearchTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {-1,0,3,5,9,12}, 9, 4),
        Arguments.of(new int[] {-1,0,3,5,9,12}, 2, -1),
        Arguments.of(new int[] {5}, 5, 0),
        Arguments.of(new int[] {2,5}, 0, -1),
        Arguments.of(new int[] {-1,0,2,4,6,8}, 4, 3),
        Arguments.of(new int[] {-1,0,2,4,6,8}, 3, -1),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int target, int expected) {
        assertThat(BinarySearch.solution(nums, target)).isEqualTo(expected);
    }

}
