package codingdojo.neetcode.heap;

import static codingdojo.neetcode.heap.LastStoneWeight.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class LastStoneWeightTest {
    @Test
    public void testSolution0() {
        int[] input = {2,7,4,1,8,1};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    public void testSolution1() {
        int[] input = {1};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    public void testSolution2() {
        int[] input = {2,3,6,2,4};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
    @Test
    public void testSolution3() {
        int[] input = {1,2};
        int output = 1;
        assertThat(solution(input)).isEqualTo(output);
    }
}
