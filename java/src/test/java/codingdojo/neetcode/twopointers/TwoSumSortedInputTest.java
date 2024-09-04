package codingdojo.neetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumSortedInputTest {

    @Test
    void testSolution0() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};
        assertThat(TwoSumSortedInput.solution(nums, target)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] nums = {2,3,4};
        int target = 6;
        int[] expected = {1,3};
        assertThat(TwoSumSortedInput.solution(nums, target)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] nums = {-1,0};
        int target = -1;
        int[] expected = {1,2};
        assertThat(TwoSumSortedInput.solution(nums, target)).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int[] nums = {1,2,3,4};
        int target = 3;
        int[] expected = {1,2};
        assertThat(TwoSumSortedInput.solution(nums, target)).isEqualTo(expected);
    }
}
