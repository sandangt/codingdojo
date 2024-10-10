package senjo.field2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Ex1Test {
    @ParameterizedTest
    @CsvSource({".X..X,2", "X.XXXXX.X.,3", "XX.XXX..,2", "XXXX,2"})
    void testSolution(String s, int expected) {
        var result  = Ex1.solution(s);
        assertThat(result).isEqualTo(expected);
    }
}
