package dojo.leetcode.graph;

import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * medium
 * url: https://leetcode.com/problems/max-area-of-island/
 */
public class MaxAreaIsland {
    static int solution(int[][] grid) {
        return solution1(grid);
    }

    // region Depth-first search
    private static int solution0(int[][] grid) {
        int result = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result = Math.max(result, dfs(grid, i, j));
                }
            }
        }
        return result;
    }

    private static int dfs(int[][] grid, int x, int y) {
        if (
            x < 0 ||
            y < 0 ||
            x >= grid.length ||
            y >= grid[0].length ||
            grid[x][y] == 0
        ) {
            return 0;
        }
        grid[x][y] = 0;
        return 1 +
            dfs(grid, x+1, y) +
            dfs(grid, x, y+1) +
            dfs(grid, x-1, y) +
            dfs(grid, x, y-1);
    }
    // endregion

    // region Breath-first search
    private static int solution1(int[][] grid) {
        int result = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result = Math.max(result, bfs(grid, i, j));
                }
            }
        }
        return result;
    }

    private static int bfs(int[][] grid, int x, int y) {
        int curX, curY, result = 0;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.offer(Pair.of(x, y));
        while (!queue.isEmpty()) {
            var coordinator = queue.poll();
            curX = coordinator.getLeft();
            curY = coordinator.getRight();
            if (
                curX < 0 || curY < 0 || curX >= grid.length || curY >= grid[0].length ||
                grid[curX][curY] == 0
            ) {
                continue;
            }
            grid[curX][curY] = 0;
            queue.offer(Pair.of(curX+1, curY));
            queue.offer(Pair.of(curX, curY+1));
            queue.offer(Pair.of(curX-1, curY));
            queue.offer(Pair.of(curX, curY-1));
            result++;
        }
        return result;
    }
    // endregion

}
