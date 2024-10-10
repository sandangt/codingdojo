package dojo.leetcode.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LongestRepeatCharReplacementTest {
    @ParameterizedTest
    @CsvSource({"ABAB,2,4", "AABABBA,1,4"})
    void testSolution(String s, int k, int expected) {
        assertThat(LongestRepeatCharReplacement.solution(s, k)).isEqualTo(expected);
    }

}
