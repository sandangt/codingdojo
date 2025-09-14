package dojo.dsa.leetcode.arrayhashing;

import static dojo.dsa.leetcode.arrayhashing.TopKFrequentElements.solution;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;


class TopKFrequentElementsTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,1,1,2,2,3}, 2, new int[] {1,2}),
        Arguments.of(new int[] {1}, 1, new int[] {1}),
        Arguments.of(new int[] {7,7}, 1, new int[] {7}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int k, int[] expected) {
        assertThat(solution(nums, k)).containsExactly(expected);
    }
}
