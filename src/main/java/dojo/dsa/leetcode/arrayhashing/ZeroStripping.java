package dojo.dsa.leetcode.arrayhashing;

/**
 * medium
 * url: https://leetcode.com/problems/set-matrix-zeroes/
 */
public class ZeroStripping {

    public static void solution(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Check if the first row has zero
        for (int i=0; i<n; i++) {
            if (matrix[0][i] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        // Check if the first column has zero
        for (int i=0; i<m; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        // Use first row and column as markers
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // Zero out rows and columns based on markers
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Zero out the first row if needed
        if (firstRowHasZero) {
            for (int i=0; i<n; i++) {
                matrix[0][i] = 0;
            }
        }
        // Zero out the first column if needed
        if (firstColHasZero) {
            for (int i=0; i<m; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
