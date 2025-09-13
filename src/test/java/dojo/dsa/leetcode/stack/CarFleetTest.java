package dojo.dsa.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarFleetTest {

    private static final Arguments[] testSolution = {
        Arguments.of(12, new int[] {10,8,0,5,3}, new int[] {2,4,1,1,3}, 3),
        Arguments.of(10, new int[] {3}, new int[] {3}, 1),
        Arguments.of(100, new int[] {0,2,4}, new int[] {4,2,1}, 1),
        Arguments.of(10, new int[] {6,8}, new int[] {3,2}, 2),
        Arguments.of(15, new int[] {4,6,8}, new int[] {4,2,1}, 1),
        Arguments.of(20, new int[] {5,10,15}, new int[] {1,1,1}, 3),
        Arguments.of(12, new int[] {0,4,2}, new int[] {4,2,1}, 2),
        Arguments.of(50, new int[] {10,20,30,40}, new int[] {4,4,4,4}, 4),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int target, int[] position, int[] speed, int expected) {
        assertThat(CarFleet.solution(target, position, speed))
            .isEqualTo(expected);
    }

}
