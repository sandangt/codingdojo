package dojo.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class IsSubSequenceTest {
    @Test
    public void testSolution0() {
        String input1 = "abc", input2 = "ahbgdc";
        assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }

    @Test
    public void testSolution1() {
        String input1 = "aec", input2 = "abcde";
        assertThat(IsSubSequence.solution(input1, input2)).isFalse();
    }

    @Test
    public void testSolution2() {
        String input1 = "axc", input2 = "ahbgdc";
        assertThat(IsSubSequence.solution(input1, input2)).isFalse();
    }

    @Test
    public void testSolution3() {
        String input1 = "", input2 = "ahbgdc";
        assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }

    @Test
    public void testSolution4() {
        String input1 = "b", input2 = "abc";
        assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }
}
