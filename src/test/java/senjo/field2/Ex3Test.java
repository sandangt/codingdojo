package senjo.field2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Ex3Test {
    @ParameterizedTest
    @CsvSource({"world,1", "dddd,4", "cycle,2", "abba,2"})
    void testSolution(String s, int expected) {
        int result = Ex3.solution(s);
        assertThat(result).isEqualTo(expected);
    }
}
