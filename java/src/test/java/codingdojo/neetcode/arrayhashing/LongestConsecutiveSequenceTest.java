package codingdojo.neetcode.arrayhashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestConsecutiveSequenceTest {

    @Test
    void testSolution0() {
        int[] nums = {100,4,200,1,3,2};
        assertThat(LongestConsecutiveSequence.solution(nums)).isEqualTo(4);
    }

    @Test
    void testSolution1() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        assertThat(LongestConsecutiveSequence.solution(nums)).isEqualTo(9);
    }

    @Test
    void testSolution2() {
        int[] nums = {2,20,4,10,3,4,5};
        assertThat(LongestConsecutiveSequence.solution(nums)).isEqualTo(4);
    }

    @Test
    void testSolution3() {
        int[] nums = {0,3,2,5,4,6,1,1};
        assertThat(LongestConsecutiveSequence.solution(nums)).isEqualTo(7);
    }

}
