package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class Median2SortedArrTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,3}, new int[] {2}, 2D),
        Arguments.of(new int[] {1,2}, new int[] {3,4}, 2.5),
        Arguments.of(new int[] {}, new int[] {2,3}, 2.5),
        Arguments.of(new int[] {-5,-2}, new int[] {-3,0,1}, -2D),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums1, int[] nums2, double expected) {
        assertThat(Median2SortedArr.solution(nums1, nums2))
            .isEqualTo(expected);
    }

}
