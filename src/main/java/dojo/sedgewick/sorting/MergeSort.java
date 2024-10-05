package dojo.sedgewick.sorting;

import static dojo.sedgewick.sorting.SortUtils.less;

import java.util.ArrayDeque;
import java.util.Queue;


public class MergeSort {

    public static <Item extends Comparable<Item>> void sort(Item[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <Item extends Comparable<Item>> void sort(Item[] arr, int low, int high) {
        if (low >= high) return;
        int middle = (high + low)  / 2;
        sort(arr, low, middle);
        sort(arr, middle + 1, high);
        merge(arr, low, middle, high);
    }

    private static <Item extends Comparable<Item>> void merge(Item[] arr, int low, int middle, int high) {
        int i;
        Queue<Item> buffer1 = new ArrayDeque<>();
        Queue<Item> buffer2 = new ArrayDeque<>();

        for (i = low; i <= middle; i++) {
            buffer1.add(arr[i]);
        }
        for (i = middle + 1; i <= high; i++) {
            buffer2.add(arr[i]);
        }

        i = low;
        while (!buffer1.isEmpty() && !buffer2.isEmpty()) {
            if (less(buffer1.peek(), buffer2.peek())) {
                arr[i++] = buffer1.poll();
            } else {
                arr[i++] = buffer2.poll();
            }
        }

        while (!buffer1.isEmpty()) {
            arr[i++] = buffer1.poll();
        }
        while (!buffer2.isEmpty()) {
            arr[i++] = buffer2.poll();
        }
    }
}
