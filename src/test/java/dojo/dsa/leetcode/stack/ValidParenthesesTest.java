package dojo.dsa.leetcode.stack;


import static dojo.dsa.leetcode.stack.ValidParentheses.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class ValidParenthesesTest {
    @Test
    void testSolution0() {
        String input = "()";
        assertThat(solution(input)).isTrue();
    }

    @Test
    void testSolution1() {
        String input = "()[]{}";
        assertThat(solution(input)).isTrue();
    }

    @Test
    void testSolution2() {
        String input = "(]";
        assertThat(solution(input)).isFalse();
    }

    @Test
    void testSolution3() {
        String input = "[(])";
        assertThat(solution(input)).isFalse();
    }

    @Test
    void testSolution4() {
        String input = "([{}])";
        assertThat(solution(input)).isTrue();
    }
}
