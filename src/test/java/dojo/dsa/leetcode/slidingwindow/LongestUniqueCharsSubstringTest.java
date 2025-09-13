package dojo.dsa.leetcode.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LongestUniqueCharsSubstringTest {
    @ParameterizedTest
    @CsvSource({"abcabcbb,3", "bbbbb,1", "pwwkew,3", "zxyzxyz,3", "' ',1", "dvdf,3"})
    void testSolution(String s, int expected) {
        assertThat(LongestUniqueCharsSubstring.solution(s)).isEqualTo(expected);
    }

}
