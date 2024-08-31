package codingdojo.neetcode.arrayhashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    private static final char SPECIAL_CHAR = '.';

    static boolean solution(char[][] board) {
        Set<Character> rowSet;
        Set<Character> columnSet;

        for (int i=0; i<9; i++) {
            rowSet = new HashSet<>();
            columnSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char rc = board[i][j];
                char cc = board[j][i];
                if (rc != SPECIAL_CHAR) {
                    if (rowSet.contains(rc)) {
                        return false;
                    }
                    rowSet.add(rc);
                }
                if (cc != SPECIAL_CHAR) {
                    if (columnSet.contains(cc)) {
                        return false;
                    }
                    columnSet.add(cc);
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

    static boolean checkBlock(int rowIdx, int colIdx, char[][] board) {
        Set<Character> blockSet = new HashSet<>();
        for (int i=rowIdx; i<rowIdx+3; i++) {
            for (int j=colIdx; j<colIdx+3; j++) {
                char bc = board[i][j];
                if (bc == SPECIAL_CHAR) {
                    continue;
                }
                if (blockSet.contains(bc)) {
                    return false;
                }
                blockSet.add(bc);
            }
        }
        return true;
    }

}
