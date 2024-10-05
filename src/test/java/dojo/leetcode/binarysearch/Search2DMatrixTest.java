package dojo.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Search2DMatrixTest {
    @Test
    void testSolution0() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        assertThat(Search2DMatrix.solution(matrix, target)).isTrue();
    }
    @Test
    void testSolution1() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        assertThat(Search2DMatrix.solution(matrix, target)).isFalse();
    }
    @Test
    void testSolution3() {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;
        assertThat(Search2DMatrix.solution(matrix, target)).isTrue();
    }
    @Test
    void testSolution4() {
        int[][] matrix = {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 15;
        assertThat(Search2DMatrix.solution(matrix, target)).isFalse();
    }
    @Test
    void testSolution5() {
        int[][] matrix = {{1}};
        int target = 2;
        assertThat(Search2DMatrix.solution(matrix, target)).isFalse();
    }

}
