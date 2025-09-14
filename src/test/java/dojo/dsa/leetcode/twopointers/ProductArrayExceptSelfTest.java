package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class ProductArrayExceptSelfTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,2,3,4}, new int[] {24,12,8,6}),
        Arguments.of(new int[] {-1,1,0,-3,3}, new int[] {0,0,9,0,0}),
        Arguments.of(new int[] {-1,0,1,2,3}, new int[] {0,-6,0,0,0}),
        Arguments.of(new int[] {1,2,3,6}, new int[] {36,18,12,6}),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int[] expected) {
        assertThat(ProductArrayExceptSelf.solution(nums))
            .isEqualTo(expected);
    }

}
