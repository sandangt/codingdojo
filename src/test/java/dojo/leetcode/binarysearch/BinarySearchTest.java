package dojo.leetcode.binarysearch;

import static dojo.leetcode.binarysearch.BinarySearch.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class BinarySearchTest {
    @Test
    void testSolution0() {
        int[] input1 = {-1,0,3,5,9,12};
        int input2 = 9;
        int output = 4;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }
    @Test
    void testSolution1() {
        int[] input1 = {-1,0,3,5,9,12};
        int input2 = 2;
        int output = -1;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }

    @Test
    void testSolution2() {
        int[] input1 = {5};
        int input2 = 5;
        int output = 0;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }

    @Test
    void testSolution3() {
        int[] input1 = {2,5};
        int input2 = 0;
        int output = -1;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }

    @Test
    void testSolution4() {
        int[] input1 = {-1,0,2,4,6,8};
        int input2 = 4;
        int output = 3;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }

    @Test
    void testSolution5() {
        int[] input1 = {-1,0,2,4,6,8};
        int input2 = 3;
        int output = -1;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }
}
