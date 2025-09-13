package dojo.dsa.leetcode.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class SubstrAnagramsTest {

    private static final Arguments[] testSolution = {
        Arguments.of("cbaebabacd", "abc", new int[] {0,6}),
        Arguments.of("abab", "ab", new int[] {0,1,2}),
        Arguments.of("abcdefg", "xyz", new int[] {}),
        Arguments.of("aabacbeabac", "aab", new int[] {0,1,7}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(String s, String p, int[] expected) {
        assertThat(SubstrAnagrams.solution(s,p))
            .isEqualTo(expected);
    }

}
