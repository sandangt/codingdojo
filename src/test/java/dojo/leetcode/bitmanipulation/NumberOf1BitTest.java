package dojo.leetcode.bitmanipulation;

import static dojo.leetcode.bitmanipulation.NumberOf1Bit.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberOf1BitTest {
    @ParameterizedTest
    @CsvSource({"11,3", "128,1", "2147483645,30"})
    void testSolution0(int n, int expected) {
        assertThat(solution(n)).isEqualTo(expected);
    }
}
