package codingdojo.neetcode.arraystring;

import static org.assertj.core.api.Assertions.assertThat;
import static codingdojo.neetcode.arraystring.ConcatenationOfArray.solution;

import org.junit.jupiter.api.Test;


class ConcatenationOfArrayTest {
    @Test
    void testSolution0() {
        int[] nums = {1,2,1};
        int[] output = {1,2,1,1,2,1};
        assertThat(solution(nums)).containsExactly(output);
    }
    @Test
    void testSolution1() {
        int[] nums = {1,3,2,1};
        int[] output = {1,3,2,1,1,3,2,1};
        assertThat(solution(nums)).containsExactly(output);
    }
}
