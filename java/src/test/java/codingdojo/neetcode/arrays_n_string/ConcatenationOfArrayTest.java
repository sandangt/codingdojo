package codingdojo.neetcode.arrays_n_string;

import static org.assertj.core.api.Assertions.assertThat;
import static codingdojo.neetcode.arrays_n_string.ConcatenationOfArray.solution;

import org.junit.jupiter.api.Test;


public class ConcatenationOfArrayTest {
    @Test
    public void testSolution0() {
        int[] nums = {1,2,1};
        int[] output = {1,2,1,1,2,1};
        assertThat(solution(nums)).containsExactly(output);
    }
    @Test
    public void testSolution1() {
        int[] nums = {1,3,2,1};
        int[] output = {1,3,2,1,1,3,2,1};
        assertThat(solution(nums)).containsExactly(output);
    }
}
