package dojo.leetcode.arrayhashing;


import static dojo.leetcode.arrayhashing.LastWordLength.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class LastWordLengthTest {
    @Test
    void testSolution0() {
        String input = "Hello World";
        int output = 5;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution1() {
        String input = "   fly me   to   the moon  ";
        int output = 4;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    void testSolution2() {
        String input = "luffy is still joyboy";
        int output = 6;
        assertThat(solution(input)).isEqualTo(output);
    }
}
