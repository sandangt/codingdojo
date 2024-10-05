package dojo.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversePolishNotationTest {

    @Test
    void testSolution0() {
        String[] tokens = {"2","1","+","3","*"};
        int expected = 9;
        assertThat(ReversePolishNotation.solution(tokens)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        String[] tokens = {"4","13","5","/","+"};
        int expected = 6;
        assertThat(ReversePolishNotation.solution(tokens)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        String[] tokens = {"1","2","+","3","*","4","-"};
        int expected = 5;
        assertThat(ReversePolishNotation.solution(tokens)).isEqualTo(expected);
    }

}
