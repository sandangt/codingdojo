package battleground.part1;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

    private static final char SPECIAL_CHARACTER = '.';
    private static final int BOARD_SIZE = 9;

    public static boolean solution(char[][] sudokuBoard) {
        // region Check for row and column
        Set<Character> rowSet;
        Set<Character> colSet;
        for (int i = 0; i < BOARD_SIZE; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j = 0; j < BOARD_SIZE; j++) {
                char rowChar = sudokuBoard[i][j];
                char colChar = sudokuBoard[j][i];
                if (rowChar != SPECIAL_CHARACTER) {
                    if (rowSet.contains(rowChar)) {
                        return false;
                    }
                    rowSet.add(rowChar);
                }
                if (colChar != SPECIAL_CHARACTER) {
                    if (colSet.contains(colChar)) {
                        return false;
                    }
                    colSet.add(colChar);
                }
            }
        }
        // endregion
        // region Check for block
        for (int i = 0; i < BOARD_SIZE; i+=3) {
            for (int j = 0; j < BOARD_SIZE; j+=3) {
                if (!checkBlock(i, j, sudokuBoard)) {
                    return false;
                }
            }
        }
        // endregion
        return true;
    }

    public static boolean checkBlock(int rowIdx, int colIdx, char[][] sudokuBoard) {
        Set<Character> blockSet = new HashSet<>();
        for (int i=rowIdx; i < rowIdx + 3; i++) {
            for (int j=colIdx; j<colIdx + 3; j++) {
                char blockChar = sudokuBoard[i][j];
                if (blockChar == SPECIAL_CHARACTER) {
                    continue;
                }
                if (blockSet.contains(blockChar)) {
                    return false;
                }
                blockSet.add(blockChar);
            }
        }
        return true;
    }
}


