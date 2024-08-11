package codingdojo.sedgewick.iterating;

import java.util.Iterator;

public class ResizingArray<Item> implements Iterable<Item> {
    protected static final int INIT_CAPACITY = 8;
    protected Item[] arr;
    protected int n;

    public ResizingArray() {
        arr = (Item[]) new Object[INIT_CAPACITY];
        n = 0;
    }

    protected void resize(int capacity) {
        if (capacity < n) return;
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }
        arr = copy;
    }

    protected boolean isEmpty() {
        return n == 0;
    }

    protected int size() {
        return n;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    protected class ArrayIterator implements Iterator<Item> {
        private int i;

        private ArrayIterator() {
            i = n - 1;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }
    }

}
