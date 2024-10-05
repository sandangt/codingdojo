package battleground.part2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Test2Test {
    @Test
    void testSolution0() {
        int[] d = {5,8,2,7};
        int x = 3;
        int expected = 3;
        int result = Test2.solution(d, x);
        assertThat(expected).isEqualTo(result);
    }
    @Test
    void testSolution1() {
        int[] d = {2,5,9,2,1,4};
        int x = 4;
        int expected = 3;
        int result = Test2.solution(d, x);
        assertThat(expected).isEqualTo(result);
    }
    @Test
    void testSolution2() {
        int[] d = {1,12,10,4,5,2};
        int x = 2;
        int expected = 4;
        int result = Test2.solution(d, x);
        assertThat(expected).isEqualTo(result);
    }
}
