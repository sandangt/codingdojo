package dojo.sedgewick.sorting;

import java.util.PriorityQueue;

public class HeapSort {
    private static <Item extends Comparable<Item>> void populateHeap(Item[] items, PriorityQueue<Item> heap) {
        for (Item i: items) {
            heap.add(i);
        }
    }

    public static <Item extends Comparable<Item>> void sort(Item[] arr) {
        PriorityQueue<Item> heap = new PriorityQueue<>(); // min heap
//         PriorityQueue<Item> heap = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        populateHeap(arr, heap);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }
    }
}
