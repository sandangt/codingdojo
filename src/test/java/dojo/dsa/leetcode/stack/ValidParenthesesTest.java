package dojo.dsa.leetcode.stack;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class ValidParenthesesTest {

    @ParameterizedTest
    @CsvSource({
        "(),true", "()[]{},true", "(],false", "[(]),false", "([{}]),true"
    })
    void testSolution(String s, boolean expected) {
        assertThat(ValidParentheses.solution(s)).isEqualTo(expected);
    }

}
