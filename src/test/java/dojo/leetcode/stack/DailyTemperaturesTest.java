package dojo.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DailyTemperaturesTest {

    @Test
    void testSolution0() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] expected = {1,1,4,2,1,1,0,0};
        assertThat(DailyTemperatures.solution(temperatures)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] temperatures = {30,40,50,60};
        int[] expected = {1,1,1,0};
        assertThat(DailyTemperatures.solution(temperatures)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] temperatures = {30,60,90};
        int[] expected = {1,1,0};
        assertThat(DailyTemperatures.solution(temperatures)).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int[] temperatures = {30,38,30,36,35,40,28};
        int[] expected = {1,4,1,2,1,0,0};
        assertThat(DailyTemperatures.solution(temperatures)).isEqualTo(expected);
    }

    @Test
    void testSolution4() {
        int[] temperatures = {22,21,20};
        int[] expected = {0,0,0};
        assertThat(DailyTemperatures.solution(temperatures)).isEqualTo(expected);
    }

}
