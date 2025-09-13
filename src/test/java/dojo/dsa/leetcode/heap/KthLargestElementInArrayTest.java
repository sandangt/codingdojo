package dojo.dsa.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestElementInArrayTest {
    @Test
    void testSolution0() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int expected = 5;
        assertThat(KthLargestElementInArray.solution(nums, k)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expected = 4;
        assertThat(KthLargestElementInArray.solution(nums, k)).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] nums = {2,3,1,5,4};
        int k = 2;
        int expected = 4;
        assertThat(KthLargestElementInArray.solution(nums, k)).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int[] nums = {2,3,1,1,5,5,4};
        int k = 3;
        int expected = 4;
        assertThat(KthLargestElementInArray.solution(nums, k)).isEqualTo(expected);
    }
}
