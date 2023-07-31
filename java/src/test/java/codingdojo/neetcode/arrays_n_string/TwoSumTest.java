package codingdojo.neetcode.arrays_n_string;

import static codingdojo.neetcode.arrays_n_string.TwoSum.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class TwoSumTest {
    @Test
    public void testSolution0() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = {0,1};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    public void testSolution1() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] output = {1,2};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    public void testSolution2() {
        int[] nums = {3,3};
        int target = 6;
        int[] output = {0,1};
        assertThat(solution(nums, target)).containsExactly(output);
    }
}
