package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReversePolishNotationTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new String[] {"2","1","+","3","*"}, 9),
        Arguments.of(new String[] {"4","13","5","/","+"}, 6),
        Arguments.of(new String[] {"1","2","+","3","*","4","-"}, 5),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(String[] tokens, int expected) {
        assertThat(ReversePolishNotation.solution(tokens)).isEqualTo(expected);
    }

}
