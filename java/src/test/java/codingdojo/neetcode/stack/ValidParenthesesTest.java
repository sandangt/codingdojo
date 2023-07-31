package codingdojo.neetcode.stack;


import static codingdojo.neetcode.stack.ValidParentheses.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class ValidParenthesesTest {
    @Test
    public void testSolution0() {
        String input = "()";
        assertThat(solution(input)).isTrue();
    }

    @Test
    public void testSolution1() {
        String input = "()[]{}";
        assertThat(solution(input)).isTrue();
    }

    @Test
    public void testSolution2() {
        String input = "(]";
        assertThat(solution(input)).isFalse();
    }
}
