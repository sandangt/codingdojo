package codingdojo.neetcode.binarysearch;

import static codingdojo.neetcode.binarysearch.BinarySearch.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class BinarySearchTest {
    @Test
    public void testSolution0() {
        int[] input1 = {-1,0,3,5,9,12};
        int input2 = 9;
        int output = 4;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }
    @Test
    public void testSolution1() {
        int[] input1 = {-1,0,3,5,9,12};
        int input2 = 2;
        int output = -1;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }

    @Test
    public void testSolution2() {
        int[] input1 = {5};
        int input2 = 5;
        int output = 0;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }

    @Test
    public void testSolution3() {
        int[] input1 = {2,5};
        int input2 = 0;
        int output = -1;
        assertThat(solution(input1, input2)).isEqualTo(output);
    }
}
