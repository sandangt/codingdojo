package codingdojo.neetcode.arrays_n_string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContainsDuplicateTest {

    @Test
    public void testSolution0() {
        int[] nums = {1,2,3,1};
        Assertions.assertThat(ContainsDuplicate.solution(nums)).isTrue();
    }

    @Test
    public void testSolution1() {
        int[] nums = {1,2,3,4};
        Assertions.assertThat(ContainsDuplicate.solution(nums)).isFalse();
    }

    @Test
    public void testSolution2() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Assertions.assertThat(ContainsDuplicate.solution(nums)).isTrue();
    }
}
