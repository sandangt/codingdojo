package dojo.dsa.sedgewick.sorting;

import static dojo.dsa.sedgewick.sorting.SortUtils.exch;
import static dojo.dsa.sedgewick.sorting.SortUtils.less;


public class BubbleSort {
    public static <Item extends Comparable<Item>> void sort(Item[] arr) {
        boolean swap;
        while (true) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (less(arr[i+1], arr[i])) {
                    exch(arr, i, i+1);
                    swap = true;
                }
            }
            if (!swap) {
                return;
            }
        }
    }
}
