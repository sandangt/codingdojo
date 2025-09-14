package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class DailyTemperaturesTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {73,74,75,71,69,72,76,73}, new int[] {1,1,4,2,1,1,0,0}),
        Arguments.of(new int[] {30,40,50,60}, new int[] {1,1,1,0}),
        Arguments.of(new int[] {30,60,90}, new int[] {1,1,0}),
        Arguments.of(new int[] {30,38,30,36,35,40,28}, new int[] {1,4,1,2,1,0,0}),
        Arguments.of(new int[] {22,21,20}, new int[] {0,0,0}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] temperatures, int[] expected) {
        assertThat(DailyTemperatures.solution(temperatures)).isEqualTo(expected);
    }

}
