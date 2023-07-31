package codingdojo.sedgewick.sorting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class QuickSortTest {
    private static final Integer[] TEST_ARR = {34, 97, 1, 65, 46, 55, 55, 65, 29, 41, 92, 68, 60, 73, 97, 8, 65, 24, 68, 77, 13, 69, 91, 82, 64, 12, 35, 91, 13, 100, 33, 36, 52, 4, 54, 30, 12, 89, 86, 4, 61, 53, 57, 11, 5, 84, 10, 93, 6, 8, 88, 85, 11, 44, 2, 16, 94, 87, 34, 8, 47, 73, 35, 81, 25, 84, 51, 36, 64, 54, 41, 75, 62, 93, 64, 98, 29, 35, 30, 34, 93, 68, 90, 15, 84, 51, 72, 85, 46, 33, 88, 64, 1, 2, 10, 43, 73, 24, 79, 47};

    @Test
    @Disabled
    public void show() {
        QuickSort.sort(TEST_ARR);
        for (int i : TEST_ARR) {
            System.out.println(i);
        }
    }
}
