package dojo.leetcode.slidingwindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringPermutationTest {
    @ParameterizedTest
    @CsvSource({"ab,eidbaooo,true", "ab,eidboaoo,false"})
    void testSolution(String s1, String s2, boolean expected) {
        assertThat(StringPermutation.solution(s1, s2)).isEqualTo(expected);
    }
}
