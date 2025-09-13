package dojo.dsa.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class NextPermutationTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {1,2,3,4}, new int[] {1,2,4,3}),
        Arguments.of(new int[] {4,3,2,1}, new int[] {1,2,3,4}),
        Arguments.of(new int[] {1,2,2,3}, new int[] {1,2,3,2}),
        Arguments.of(new int[] {1,2,3}, new int[] {1,3,2}),
        Arguments.of(new int[] {3,2,1}, new int[] {1,2,3}),
        Arguments.of(new int[] {1,1,5}, new int[] {1,5,1}),
        Arguments.of(new int[] {4,4,4}, new int[] {4,4,4}),
        Arguments.of(new int[] {7}, new int[] {7}),
        Arguments.of(new int[] {0,1}, new int[] {1,0}),
        Arguments.of(new int[] {9,3}, new int[] {3,9}),
        Arguments.of(new int[] {1,4,3,2}, new int[] {2,1,3,4}),
        Arguments.of(new int[] {2,1,3,4}, new int[] {2,1,4,3}),
        Arguments.of(new int[] {1,5,5,5}, new int[] {5,1,5,5}),
        Arguments.of(new int[] {3,4,2,2,1}, new int[] {4,1,2,2,3}),
        Arguments.of(new int[] {1,2,1,2,1}, new int[] {1,2,2,1,1}),
        Arguments.of(new int[] {10,20,100,30}, new int[] {10,30,20,100}),
        Arguments.of(new int[] {0,0,1,0}, new int[] {0,1,0,0}),
        Arguments.of(new int[] {0,3,2,1}, new int[] {1,0,2,3}),
        Arguments.of(new int[] {2,2,1,1}, new int[] {1,1,2,2}),
        Arguments.of(new int[] {1,1,1,2,3}, new int[] {1,1,1,3,2})
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] nums, int[] expected) {
        assertThat(NextPermutation.solution(nums))
            .isEqualTo(expected);
    }

}
