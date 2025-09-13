package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveAdjacentDupTest {

    @ParameterizedTest
    @CsvSource({
        "abbaca,ca", "azxxzy,ay", "aabbcc,''",
        "abcddcba,''", "abccba,''", "aabcca,ba",
        "aaaa,''", "abba,''", "abbaa,a"
    })
    void testSolution(String s, String expected) {
        assertThat(RemoveAdjacentDup.solution(s))
            .isEqualTo(expected);
    }

}
