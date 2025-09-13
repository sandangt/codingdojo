package dojo.dsa.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

class IsSubSequenceTest {

    private static final Arguments[] testSolution = {
        Arguments.of("abc","ahbgdc",true),
        Arguments.of("aec","abcde",false),
        Arguments.of("axc","ahbgdc",false),
        Arguments.of("","ahbgdc",true),
        Arguments.of("b","abc",true),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(String input1, String input2, boolean expected) {
        assertThat(IsSubSequence.solution(input1, input2))
            .isEqualTo(expected);
    }

}
