package codingdojo.neetcode.bitmanipulation;

import static codingdojo.neetcode.bitmanipulation.NumberOf1Bit.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class NumberOf1BitTest {
    @Test
    public void testSolution0() {
        int input = 11;
        int output = 3;
        assertThat(solution(input)).isEqualTo(output);
    }
}
