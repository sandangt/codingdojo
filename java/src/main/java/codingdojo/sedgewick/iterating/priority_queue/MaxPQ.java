package codingdojo.sedgewick.iterating.priority_queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.IntFunction;


public class MaxPQ<Item extends Comparable<Item>> implements Iterable<Item> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final IntFunction<Integer> LEFT_CHILD = position -> 2 * position + 1;
    private static final IntFunction<Integer> RIGHT_CHILD = position -> 2 * position + 2;
    private static final IntFunction<Integer> PARENT = position -> (position - 1) / 2;
    private Item[] heap;
    private int n;
    private Comparator<Item> comparator;

    // region Constructors
    public MaxPQ(int capacity) {
        heap = (Item[]) new Comparable[capacity];
        n = 0;
    }

    public MaxPQ() {
        this(DEFAULT_CAPACITY);
    }

    public MaxPQ(int capacity, Comparator<Item> comparator) {
        this.comparator = comparator;
        heap = (Item[]) new Comparable[capacity];
        n = 0;
    }

    public MaxPQ(Item[] items) {
        n = 0;
        heap = (Item[]) new Comparable[2 * items.length];
        for (int i = 0; i < items.length; i++) {
            insert(items[i]);
        }
        assert isMaxHeap();
    }
    // endregion

    // region Public helpers
    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public Item peek() {
        if (isEmpty()) return null;
        return heap[0];
    }

    public void insert(Item x) {
        if (n == heap.length) resize(2 * heap.length);
        heap[n++] = x;
        rise(n - 1);
    }

    public Item extract() {
        if (isEmpty()) return null;
        Item extractItem = heap[0];
        exch(0, n - 1);
        heap[n--] = null;
        sink(0);
        if ((n > 0) && (n == heap.length / 4)) resize(heap.length / 2);
        return extractItem;
    }
    // endregion

    // region Private helpers
    private void resize(int capacity) {
        if (capacity <= n) return;
        Item[] temp = (Item[]) new Comparable[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    private boolean less(int pos1, int pos2) {
        if (comparator == null) {
            return heap[pos1].compareTo(heap[pos2]) < 0;
        }
        return comparator.compare(heap[pos1], heap[pos2]) < 0;
    }

    private void exch(int pos1, int pos2) {
        Item swap = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = swap;
    }

    private boolean isMaxHeap() {
        for (int i = 0; i < n; i++) {
            if (heap[i] == null) return false;
        }
        for (int i = n; i < heap.length; i++) {
            if (heap[i] != null) return false;
        }
        return isMaxHeapOrdered(0);
    }

    private boolean isMaxHeapOrdered(int position) {
        if (position >= n) return true;
        int leftChild = LEFT_CHILD.apply(position);
        int rightChild = RIGHT_CHILD.apply(position);
        if (leftChild < n && less(position, leftChild)) return false;
        if (rightChild < n && less(position, rightChild)) return false;
        return isMaxHeapOrdered(leftChild) && isMaxHeapOrdered(rightChild);
    }
    // endregion

    // region Core
    private void rise(int position) {
        int parentPosition;
        while (position > 0 && less(parentPosition = PARENT.apply(position), position)) {
            exch(parentPosition, position);
            position = parentPosition;
        }
    }

    private void sink(int position) {
        int leftChildPosition, rightChildPosition;
        while (true) {
            if ((leftChildPosition = LEFT_CHILD.apply(position)) > n) {
                break;
            }
            if (less(position, leftChildPosition)) {
                exch(position, leftChildPosition);
                position = leftChildPosition;
                continue;
            }
            if ((rightChildPosition = RIGHT_CHILD.apply(position)) > n) {
                break;
            }
            if (less(position, rightChildPosition)) {
                exch(position, rightChildPosition);
                position = rightChildPosition;
            }
        }
    }
    // endregion

    // region Iterating
    @Override
    public Iterator<Item> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Item> {
        private int i;

        public HeapIterator() {
            i = 0;
        }

        @Override
        public boolean hasNext() {
            return heap[i] != null;
        }

        @Override
        public Item next() {
            return heap[i++];
        }
    }
    // endregion
}
