package dojo.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestUniqueCharsSubstringTest {
    @Test
    void testSolution0() {
        String s = "abcabcbb";
        int expected = 3;
        assertThat(LongestUniqueCharsSubstring.solution(s)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        String s = "bbbbb";
        int expected = 1;
        assertThat(LongestUniqueCharsSubstring.solution(s)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        String s = "pwwkew";
        int expected = 3;
        assertThat(LongestUniqueCharsSubstring.solution(s)).isEqualTo(expected);
    }

    @Test
    void testSolution4() {
        String s = "zxyzxyz";
        int expected = 3;
        assertThat(LongestUniqueCharsSubstring.solution(s)).isEqualTo(expected);
    }

    @Test
    void testSolution5() {
        String s = " ";
        int expected = 1;
        assertThat(LongestUniqueCharsSubstring.solution(s)).isEqualTo(expected);
    }

}
