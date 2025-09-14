package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class Search2DMatrixTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3, true),
        Arguments.of(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13, false),
        Arguments.of(new int[][] {{1,2,4,8},{10,11,12,13},{14,20,30,40}}, 10, true),
        Arguments.of(new int[][] {{1,2,4,8},{10,11,12,13},{14,20,30,40}}, 15, false),
        Arguments.of(new int[][] {{1}}, 2, false),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[][] matrix, int target, boolean expected) {
        assertThat(Search2DMatrix.solution(matrix, target)).isEqualTo(expected);
    }

}
