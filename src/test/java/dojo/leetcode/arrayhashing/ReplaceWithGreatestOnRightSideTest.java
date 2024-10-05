package dojo.leetcode.arrayhashing;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class ReplaceWithGreatestOnRightSideTest {
    @Test
    public void testSolution0() {
        int[] input = {17,18,5,4,6,1};
        int[] output = {18,6,6,6,1,-1};
        Assertions.assertThat(ReplaceWithGreatestOnRightSide.solution(input)).containsExactly(output);
    }

    @Test
    public void testSolution1() {
        int[] input = {400};
        int[] output = {-1};
        assertThat(ReplaceWithGreatestOnRightSide.solution(input)).containsExactly(output);
    }
}
