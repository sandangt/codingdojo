package dojo.dsa.leetcode.twopointers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;


class ValidPalindromeTest {

    private static final Arguments[] testSolution = {
        Arguments.of("A man, a plan, a canal: Panama", true),
        Arguments.of(" ", true),
        Arguments.of("race a car", false),
        Arguments.of("Was it a car or a cat I saw?", true),
        Arguments.of("tab a cat", false),
        Arguments.of("a dog! a panic in a pagoda.", true),
        Arguments.of("abc123", false),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(String s, boolean expected) {
        assertThat(ValidPalindrome.solution(s)).isEqualTo(expected);
    }

}

