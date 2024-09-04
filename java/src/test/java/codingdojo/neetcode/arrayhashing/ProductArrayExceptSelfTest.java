package codingdojo.neetcode.arrayhashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductArrayExceptSelfTest {

    @Test
    void testSolution0() {
        int[] nums = {1,2,3,4};
        int[] answer = {24,12,8,6};
        assertThat(ProductArrayExceptSelf.solution(nums)).isEqualTo(answer);
    }

    @Test
    void testSolution1() {
        int[] nums = {-1,1,0,-3,3};
        int[] answer = {0,0,9,0,0};
        assertThat(ProductArrayExceptSelf.solution(nums)).isEqualTo(answer);
    }

    @Test
    void testSolution2() {
        int[] nums = {-1,0,1,2,3};
        int[] answer = {0,-6,0,0,0};
        assertThat(ProductArrayExceptSelf.solution(nums)).isEqualTo(answer);
    }

    @Test
    void testSolution3() {
        int[] nums = {1,2,3,6};
        int[] answer = {48,24,12,8};
        assertThat(ProductArrayExceptSelf.solution(nums)).isEqualTo(answer);
    }
}
