package dojo.dsa.leetcode.arrayhashing;

/**
 * medium
 * url: https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {

    private static final char SPECIAL_CHAR = '.';
    private static final char STARTER_CHAR = '0';

    public static boolean solution(char[][] board) {
        boolean[] rowSet;
        boolean[] colSet;

        for (int i=0; i<9; i++) {
            rowSet = new boolean[10];
            colSet = new boolean[10];
            for (int j = 0; j < 9; j++) {
                char rc = board[i][j];
                char cc = board[j][i];
                if (rc != SPECIAL_CHAR) {
                    if (rowSet[rc - STARTER_CHAR]) {
                        return false;
                    }
                    rowSet[rc - STARTER_CHAR] = true;
                }
                if (cc != SPECIAL_CHAR) {
                    if (colSet[cc - STARTER_CHAR]) {
                        return false;
                    }
                    colSet[cc - STARTER_CHAR] = true;
                }
            }
        }

        for (int i=0; i<9; i+=3) {
            for (int j=0; j<9; j+=3) {
                if (!checkBlock(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkBlock(int rowIdx, int colIdx, char[][] board) {
        boolean[] blockSet = new boolean[10];
        for (int i=rowIdx; i<rowIdx+3; i++) {
            for (int j=colIdx; j<colIdx+3; j++) {
                char bc = board[i][j];
                if (bc == SPECIAL_CHAR) {
                    continue;
                }
                if (blockSet[bc - STARTER_CHAR]) {
                    return false;
                }
                blockSet[bc - STARTER_CHAR] = true;
            }
        }
        return true;
    }

}
