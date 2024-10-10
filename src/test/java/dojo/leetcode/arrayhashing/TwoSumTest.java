package dojo.leetcode.arrayhashing;

import static dojo.leetcode.arrayhashing.TwoSum.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class TwoSumTest {
    @Test
    void testSolution0() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = {0,1};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    void testSolution1() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] output = {1,2};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    void testSolution2() {
        int[] nums = {3,3};
        int target = 6;
        int[] output = {0,1};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    void testSolution3() {
        int[] nums = {3,4,5,6};
        int target = 7;
        int[] output = {0,1};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    void testSolution4() {
        int[] nums = {4,5,6};
        int target = 10;
        int[] output = {0,2};
        assertThat(solution(nums, target)).containsExactly(output);
    }

    @Test
    void testSolution5() {
        int[] nums = {5,5};
        int target = 10;
        int[] output = {0,1};
        assertThat(solution(nums, target)).containsExactly(output);
    }
}
