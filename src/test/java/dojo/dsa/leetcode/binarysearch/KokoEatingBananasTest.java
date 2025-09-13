package dojo.dsa.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.FieldSource;

import static org.assertj.core.api.Assertions.assertThat;

class KokoEatingBananasTest {

    private static final Arguments[] testSolution = {
        Arguments.of(new int[] {3,6,7,11}, 8, 4),
        Arguments.of(new int[] {30,11,23,4,20}, 5, 30),
        Arguments.of(new int[] {30,11,23,4,20}, 6, 23),
    };

    @ParameterizedTest
    @FieldSource
    void testSolution(int[] piles, int h, int expected) {
        assertThat(KokoEatingBananas.solution(piles, h))
            .isEqualTo(expected);
    }

}
