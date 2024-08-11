package codingdojo.sedgewick.iterating;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ResizingArrayStack<Item> extends ResizingArray<Item> implements IStack<Item> {
    public ResizingArrayStack() {
        super();
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
    public void push(Item item) {
        if (n == arr.length) resize(2 * arr.length);
        arr[n++] = item;
    }

    @Override
    public Item pop() {
        if (isEmpty()) return null;
        Item returnItem = arr[--n];
        arr[n] = null;
        if (n > 0 && n < arr.length / 4) resize(arr.length / 2);
        return returnItem;
    }

    @Override
    public Item peek() {
        return isEmpty() ? null : arr[n - 1];
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i;

        private ReverseArrayIterator() {
            i = n - 1;
        }

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return arr[i--];
        }
    }
}
