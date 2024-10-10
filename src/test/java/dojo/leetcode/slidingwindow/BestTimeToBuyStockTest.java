package dojo.leetcode.slidingwindow;

import static dojo.leetcode.slidingwindow.BestTimeToBuyStock.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class BestTimeToBuyStockTest {
    @Test
    void testSolution0() {
        int[] input = {7,1,5,3,6,4};
        int output = 5;
        assertThat(solution(input)).isEqualTo(output);
    }

    @Test
    void testSolution1() {
        int[] input = {7,6,4,3,1};
        int output = 0;
        assertThat(solution(input)).isEqualTo(output);
    }

    @Test
    void testSolution2() {
        int[] input = {1,2,4,2,5,7,2,4,9,0,9};
        int output = 9;
        assertThat(solution(input)).isEqualTo(output);
    }

    @Test
    void testSolution3() {
        int[] input = {10,1,5,6,7,1};
        int output = 6;
        assertThat(solution(input)).isEqualTo(output);
    }

    @Test
    void testSolution4() {
        int[] input = {10,8,7,5,2};
        int output = 0;
        assertThat(solution(input)).isEqualTo(output);
    }
}
