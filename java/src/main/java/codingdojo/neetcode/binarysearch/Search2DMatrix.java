package codingdojo.neetcode.binarysearch;

/**
 * medium
 * url: https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Search2DMatrix {
    static boolean solution(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length, columns = matrix[0].length;
        return binarySearch(matrix, target, 0, rows * columns - 1);
    }

    private static boolean binarySearch(int[][] matrix, int target, int low, int high) {
        if (low > high) return false;
        int middle = (low + high) / 2;
        int columns = matrix[0].length;
        if (target < matrix[middle/columns][middle%columns]) return binarySearch(matrix, target, low, middle-1);
        if (target > matrix[middle/columns][middle%columns]) return binarySearch(matrix, target, middle+1, high);
        return true;
    }

}
