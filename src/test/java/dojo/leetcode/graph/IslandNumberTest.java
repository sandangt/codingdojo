package dojo.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IslandNumberTest {

    @Test
    void testSolution0() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        int expected = 1;
        assertThat(IslandNumber.solution(grid)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        int expected = 3;
        assertThat(IslandNumber.solution(grid)).isEqualTo(expected);
    }

}
