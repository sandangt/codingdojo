package codingdojo.sedgewick.iterating;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ResizingArrayQueue<Item> extends ResizingArray<Item> implements IQueue<Item> {

    private int first;
    private int last;

    public ResizingArrayQueue() {
        super();
        first = 0;
        last = -1;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    protected void resize(int capacity) {
        if (capacity < n) return;
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = arr[(first + i) % arr.length];
        }
        arr = copy;
        first = 0;
        last = n;
    }

    @Override
    public void enqueue(Item item) {
        if (n == arr.length) resize(2 * arr.length);
        last = (last + 1) % arr.length;
        arr[last] = item;
        n++;
    }

    @Override
    public Item dequeue() {
        if (isEmpty()) return null;
        Item item = arr[first];
        arr[first] = null;
        n--;
        first = (first + 1) % arr.length;
        if (n > 0 && n < arr.length / 4) resize(arr.length / 2);
        return item;
    }

    @Override
    public Item peek() {
        return isEmpty() ? null : arr[first];
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int i;

        private ArrayIterator() {
            i = 0;
        }

        public boolean hasNext() {
            return i < n;
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = arr[(i + first) % arr.length];
            i++;
            return item;
        }
    }
}
