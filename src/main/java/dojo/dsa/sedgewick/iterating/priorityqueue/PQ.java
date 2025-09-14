package dojo.dsa.sedgewick.iterating.priorityqueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.IntFunction;

public abstract class PQ <Item extends Comparable<Item>> implements Iterable<Item> {

    protected static final int DEFAULT_CAPACITY = 10;
    protected static final IntFunction<Integer> LEFT_CHILD = position -> 2 * position + 1;
    protected static final IntFunction<Integer> RIGHT_CHILD = position -> 2 * position + 2;
    protected static final IntFunction<Integer> PARENT = position -> (position - 1) / 2;

    protected Item[] heap;
    protected int n;
    protected Comparator<Item> comparator;

    // region Default constructors
    protected PQ(int capacity) {
        heap = (Item[]) new Comparable[capacity];
        n = 0;
    }

    protected PQ() {
        this(DEFAULT_CAPACITY);
    }

    protected PQ(int capacity, Comparator<Item> comparator) {
        this.comparator = comparator;
        heap = (Item[]) new Comparable[capacity];
        n = 0;
    }

    protected PQ(Item[] items) {
        n = 0;
        heap = (Item[]) new Comparable[2 * items.length];
        for (int i = 0; i < items.length; i++) {
            insert(items[i]);
        }
        assert isHeap();
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
        heap[--n] = null;
        sink(0);
        if ((n > 0) && (n == heap.length / 4)) resize(heap.length / 2);
        return extractItem;
    }
    // endregion

    // region Private helpers
    protected void resize(int capacity) {
        if (capacity <= n) return;
        Item[] temp = (Item[]) new Comparable[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    protected boolean less(int pos1, int pos2) {
        if (comparator == null) {
            return heap[pos1].compareTo(heap[pos2]) < 0;
        }
        return comparator.compare(heap[pos1], heap[pos2]) < 0;
    }

    protected void exch(int pos1, int pos2) {
        Item swap = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = swap;
    }

    protected boolean isHeap() {
        for (int i = 0; i < n; i++) {
            if (heap[i] == null) return false;
        }
        for (int i = n; i < heap.length; i++) {
            if (heap[i] != null) return false;
        }
        return isHeapOrdered(0);
    }
    // endregion

    // region Core
    protected abstract boolean isHeapOrdered(int position); // is min heap or max heap

    protected abstract void rise(int position);

    protected abstract void sink(int position);
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
            if (!hasNext()) throw new NoSuchElementException();
            return heap[i++];
        }
    }
    // endregion
}
