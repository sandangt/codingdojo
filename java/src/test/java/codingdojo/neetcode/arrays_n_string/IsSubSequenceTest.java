package codingdojo.neetcode.arrays_n_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class IsSubSequenceTest {
    @Test
    public void testSolution0() {
        String input1 = "abc", input2 = "ahbgdc";
        Assertions.assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }

    @Test
    public void testSolution1() {
        String input1 = "aec", input2 = "abcde";
        Assertions.assertThat(IsSubSequence.solution(input1, input2)).isFalse();
    }

    @Test
    public void testSolution2() {
        String input1 = "axc", input2 = "ahbgdc";
        Assertions.assertThat(IsSubSequence.solution(input1, input2)).isFalse();
    }
}
