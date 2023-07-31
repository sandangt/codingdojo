package codingdojo.sedgewick.sorting;

import static codingdojo.sedgewick.sorting.SortUtils.exch;
import static codingdojo.sedgewick.sorting.SortUtils.less;


public class QuickSort {
    public static <Item extends Comparable<Item>> void sort(Item[] arr) {
        sort(arr, 0, arr.length - 1);
    }
    private static <Item extends Comparable<Item>> void sort(Item[] arr, int low, int high) {
        if (low >= high) return;
        int pivot = partition(arr, low, high);
        sort(arr, low, pivot - 1);
        sort(arr, pivot + 1, high);
    }

    private static <Item extends Comparable<Item>> int partition(Item[] arr, int low, int high) {
        int firstHigh = low, pivot = high;
        for (int i = low; i < high; i++) {
            if (less(arr[i], arr[pivot])) {
                exch(arr, i, firstHigh);
                firstHigh++;
            }
        }
        exch(arr, firstHigh, pivot);
        return firstHigh;
    }
}
