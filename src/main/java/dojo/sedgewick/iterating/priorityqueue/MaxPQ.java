package dojo.sedgewick.iterating.priorityqueue;

import java.util.Comparator;


public final class MaxPQ<Item extends Comparable<Item>> extends PQ<Item> {

    // region Constructors
    public MaxPQ(int capacity) {
        super(capacity);
    }

    public MaxPQ() {
        super(DEFAULT_CAPACITY);
    }

    public MaxPQ(int capacity, Comparator<Item> comparator) {
        super(capacity, comparator);
    }

    public MaxPQ(Item[] items) {
       super(items);
    }
    // endregion

    // region Core
    @Override
    public boolean isHeapOrdered(int position) {
        if (position >= n) return true;
        int leftChild = LEFT_CHILD.apply(position);
        int rightChild = RIGHT_CHILD.apply(position);
        if (leftChild < n && less(position, leftChild)) return false;
        if (rightChild < n && less(position, rightChild)) return false;
        return isHeapOrdered(leftChild) && isHeapOrdered(rightChild);
    }

    @Override
    public void rise(int position) {
        int parentPosition;
        while (position > 0 && less(parentPosition = PARENT.apply(position), position)) {
            exch(parentPosition, position);
            position = parentPosition;
        }
    }

    @Override
    public void sink(int position) {
        int leftChildPosition, rightChildPosition, chosenChildPosition;
        while (true) {
            leftChildPosition = LEFT_CHILD.apply(position);
            rightChildPosition = RIGHT_CHILD.apply(position);
            if (leftChildPosition >= n && rightChildPosition >= n) {
                break;
            } else if (leftChildPosition >= n) {
                chosenChildPosition = rightChildPosition;
            } else if (rightChildPosition >= n) {
                chosenChildPosition = leftChildPosition;
            } else {
                chosenChildPosition = less(leftChildPosition, rightChildPosition) ? rightChildPosition : leftChildPosition;
            }

            if (less(position, chosenChildPosition)) {
                exch(position, chosenChildPosition);
                position = chosenChildPosition;
            } else {
                break;
            }
        }
    }
    // endregion

}
