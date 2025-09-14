package dojo.dsa.leetcode.twopointers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

class ReplaceWithGreatestOnRightSideTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {17,18,5,4,6,1}, new int[] {18,6,6,6,1,-1}),
        Arguments.of(new int[] {400}, new int[] {-1}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] arr, int[] expected) {
        ReplaceWithGreatestOnRightSide.solution(arr);
        Assertions.assertThat(arr).containsExactly(expected);
    }

}
