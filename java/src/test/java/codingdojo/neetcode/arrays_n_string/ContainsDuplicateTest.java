package codingdojo.neetcode.arrays_n_string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class ContainsDuplicateTest {

    @Test
    public void testSolution0() {
        int[] nums = {1,2,3,1};
        assertThat(ContainsDuplicate.solution(nums)).isTrue();
    }

    @Test
    public void testSolution1() {
        int[] nums = {1,2,3,4};
        assertThat(ContainsDuplicate.solution(nums)).isFalse();
    }

    @Test
    public void testSolution2() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertThat(ContainsDuplicate.solution(nums)).isTrue();
    }
}
