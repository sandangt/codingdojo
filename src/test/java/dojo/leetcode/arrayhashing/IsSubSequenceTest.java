package dojo.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class IsSubSequenceTest {
    @Test
    void testSolution0() {
        String input1 = "abc", input2 = "ahbgdc";
        assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }

    @Test
    void testSolution1() {
        String input1 = "aec", input2 = "abcde";
        assertThat(IsSubSequence.solution(input1, input2)).isFalse();
    }

    @Test
    void testSolution2() {
        String input1 = "axc", input2 = "ahbgdc";
        assertThat(IsSubSequence.solution(input1, input2)).isFalse();
    }

    @Test
    void testSolution3() {
        String input1 = "", input2 = "ahbgdc";
        assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }

    @Test
    void testSolution4() {
        String input1 = "b", input2 = "abc";
        assertThat(IsSubSequence.solution(input1, input2)).isTrue();
    }
}
