package dojo.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxAreaIslandTest {
    @Test
    void testSolution0() {
        int[][] grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int expected = 6;
        assertThat(MaxAreaIsland.solution(grid)).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[][] grid = {
            {0,0,0,0,0,0,0,0}
        };
        int expected = 0;
        assertThat(MaxAreaIsland.solution(grid)).isEqualTo(expected);
    }

}
