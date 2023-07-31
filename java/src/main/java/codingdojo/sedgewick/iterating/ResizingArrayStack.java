package codingdojo.sedgewick.iterating;

import java.util.Iterator;
import java.util.Optional;


public class ResizingArrayStack<Item> extends ResizingArray<Item> implements IStack<Item> {
    public ResizingArrayStack() {
        super();
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void push(Item item) {
        if (n == arr.length) resize(2 * arr.length);
        arr[n++] = item;
    }

    @Override
    public Optional<Item> pop() {
        if (isEmpty()) return Optional.empty();
        Item returnItem = arr[--n];
        arr[n] = null;
        if (n > 0 && n < arr.length / 4) resize(arr.length / 2);
        return Optional.ofNullable(returnItem);
    }

    @Override
    public Item peek() {
        return arr[n - 1];
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
            return arr[i--];
        }
    }
}
