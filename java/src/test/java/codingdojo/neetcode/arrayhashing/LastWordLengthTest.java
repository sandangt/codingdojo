package codingdojo.neetcode.arrayhashing;


import static codingdojo.neetcode.arrayhashing.LastWordLength.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class LastWordLengthTest {
    @Test
    public void testSolution0() {
        String input = "Hello World";
        int output = 5;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    public void testSolution1() {
        String input = "   fly me   to   the moon  ";
        int output = 4;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    public void testSolution2() {
        String input = "luffy is still joyboy";
        int output = 6;
        assertThat(solution(input)).isEqualTo(output);
    }
}
