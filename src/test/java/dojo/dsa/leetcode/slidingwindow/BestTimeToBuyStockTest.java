package dojo.dsa.leetcode.slidingwindow;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;


class BestTimeToBuyStockTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {7,1,5,3,6,4}, 5),
        Arguments.of(new int[] {7,6,4,3,1}, 0),
        Arguments.of(new int[] {1,2,4,2,5,7,2,4,9,0,9}, 9),
        Arguments.of(new int[] {10,1,5,6,7,1}, 6),
        Arguments.of(new int[] {10,8,7,5,2}, 0),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int expected) {
        assertThat(BestTimeToBuyStock.solution(nums))
            .isEqualTo(expected);
    }

}
