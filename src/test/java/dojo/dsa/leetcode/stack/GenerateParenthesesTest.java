package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateParenthesesTest {

    private static final Arguments[] testSolution = {
        Arguments.of(3, new String[] {"((()))","(()())","(())()","()(())","()()()"}),
        Arguments.of(1, new String[] {"()"}),
        Arguments.of(2, new String[] {"(())","()()"}),
        Arguments.of(4, new String[] {"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int n, String[] expected) {
        assertThat(GenerateParentheses.solution(n))
            .isEqualTo(expected);
    }

}
