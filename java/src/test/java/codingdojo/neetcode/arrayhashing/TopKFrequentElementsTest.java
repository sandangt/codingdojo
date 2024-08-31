package codingdojo.neetcode.arrayhashing;

import static codingdojo.neetcode.arrayhashing.TopKFrequentElements.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class TopKFrequentElementsTest {
    @Test
    public void testSolution0() {
        int[] input1 = {1,1,1,2,2,3};
        int input2 = 2;
        int[] output = {1,2};
        assertThat(solution(input1, input2)).containsExactly(output);
    }

    @Test
    public void testSolution1() {
        int[] input1 = {1};
        int input2 = 1;
        int[] output = {1};
        assertThat(solution(input1, input2)).containsExactly(output);
    }
}
