package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {
    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {0, -1, 2, -3, 1}, new int[][] {{-3,1,2},{-1,0,1}}),
        Arguments.of(new int[] {-1,0,1,2,-1,-4}, new int[][] {{-1,-1,2},{-1, 0, 1}}),
        Arguments.of(new int[] {0,0,0,0}, new int[][] {{0,0,0}}),
        Arguments.of(new int[] {100, -50, -50, 200, -100, -100, 0}, new int[][] {{-100, 0, 100}, {-50, -50, 100}, {-100, -100, 200}}),
        Arguments.of(new int[] {1,2,3,4,5}, new int[][] {}),
        Arguments.of(new int[] {1,2,3}, new int[][] {}),
        Arguments.of(new int[] {0,1,1}, new int[][] {}),
        Arguments.of(new int[] {-2,0,0,2,2}, new int[][] {{-2,0,2}})
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int[][] expected) {
        var actual = ThreeSum.solution(nums);
        assertThat(Arrays.asList(actual)).containsAll(Arrays.asList(expected));
    }

}
