package dojo.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {

    @Test
    void testSolution0() {
        int[] nums = {-1,0,1,2,-1,4};
        List<List<Integer>> output = List.of(
            List.of(-1,-1,2),
            List.of(-1, 0, 1)
        );
        assertThat(ThreeSum.solution(nums)).isEqualTo(output);
    }

    @Test
    void testSolution1() {
        int[] nums = {0,1,1};
        List<List<Integer>> output = Collections.emptyList();
        assertThat(ThreeSum.solution(nums)).isEqualTo(output);
    }

    @Test
    void testSolution2() {
        int[] nums = {0,0,0};
        List<List<Integer>> output = List.of(List.of(0,0,0));
        assertThat(ThreeSum.solution(nums)).isEqualTo(output);
    }

    @Test
    void testSolution3() {
        int[] nums = {-2,0,0,2,2};
        List<List<Integer>> output = List.of(List.of(-2,0,2));
        assertThat(ThreeSum.solution(nums)).isEqualTo(output);
    }

}
