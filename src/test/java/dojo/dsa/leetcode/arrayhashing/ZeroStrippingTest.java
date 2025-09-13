package dojo.dsa.leetcode.arrayhashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class ZeroStrippingTest {

    private static final Arguments[] testSolution = {
        Arguments.of(
            new int[][] {{1,1,1},{1,0,1},{1,1,1}}, new int[][] {{1,0,1},{0,0,0},{1,0,1}}),
        Arguments.of(
            new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}}, new int[][] {{0,0,0,0},{0,4,5,0},{0,3,1,0}}),
        Arguments.of(
            new int[][] {{1,2,3},{4,5,6},{7,8,9}}, new int[][] {{1,2,3},{4,5,6},{7,8,9}}),
        Arguments.of(
            new int[][] {{1,0,1},{1,1,1},{0,1,1}}, new int[][] {{0,0,0},{0,0,1},{0,0,0}}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[][] matrix, int[][] expected) {
        ZeroStripping.solution(matrix);
        assertThat(matrix).isEqualTo(expected);
    }

}
