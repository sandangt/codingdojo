package codingdojo.sedgewick.sorting;

import static codingdojo.sedgewick.sorting.SortUtils.exch;
import static codingdojo.sedgewick.sorting.SortUtils.less;


public class SelectionSort {

    public static <Item extends Comparable<Item>> void sort(Item[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr[j], arr[i])) {
                    exch(arr, i, j);
                }
            }
        }
    }
}
