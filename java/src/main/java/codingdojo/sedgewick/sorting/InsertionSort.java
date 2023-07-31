package codingdojo.sedgewick.sorting;

import static codingdojo.sedgewick.sorting.SortUtils.exch;
import static codingdojo.sedgewick.sorting.SortUtils.less;


public class InsertionSort {
    public static <Item extends Comparable<Item>> void sort(Item[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(arr[j], arr[j - 1])) {
                    exch(arr, j, j-1);
                }
            }
        }
    }
}
