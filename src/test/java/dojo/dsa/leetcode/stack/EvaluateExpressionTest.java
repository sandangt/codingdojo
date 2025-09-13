package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class EvaluateExpressionTest {

    @ParameterizedTest
    @CsvSource({
        "18-(7+(2-4)),13",
        "1+1,2",
        "2-(5-6),3",
        "10-(2+3),5",
        "(1+(4+5+2)-3)+(6+8),23",
        "7-(3-(2+1)),7",
        "100,100",
        "50-(25-(10-5)),30",
        "(8-(3-(2-(1-5)))),11"

    })
    void testSolution(String s, int expected) {
        assertThat(EvaluateExpression.solution(s))
            .isEqualTo(expected);
    }

}
