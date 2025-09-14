package dojo.dsa.sedgewick.iterating.priorityqueue;

import java.util.Comparator;

public final class MinPQ<Item extends Comparable<Item>> extends PQ<Item> {

    // region Constructors
    public MinPQ(int capacity) {
        super(capacity);
    }

    public MinPQ() {
        super(DEFAULT_CAPACITY);
    }

    public MinPQ(int capacity, Comparator<Item> comparator) {
        super(capacity, comparator);
    }

    public MinPQ(Item[] items) {
        super(items);
    }
    // endregion

    // region Core
    @Override
    protected boolean isHeapOrdered(int position) {
        if (position >= n) return true;
        int leftChild = LEFT_CHILD.apply(position);
        int rightChild = RIGHT_CHILD.apply(position);
        if (leftChild < n && less(leftChild, position)) return false;
        if (rightChild < n && less(rightChild, position)) return false;
        return isHeapOrdered(leftChild) && isHeapOrdered(rightChild);
    }

    @Override
    protected void rise(int position) {
        int parentPosition;
        while (position > 0 && less(position, parentPosition = PARENT.apply(position))) {
            exch(parentPosition, position);
            position = parentPosition;
        }
    }

    @Override
    protected void sink(int position) {
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
                chosenChildPosition = less(leftChildPosition, rightChildPosition) ? leftChildPosition : rightChildPosition;
            }

            if (less(chosenChildPosition, position)) {
                exch(position, chosenChildPosition);
                position = chosenChildPosition;
            } else {
                break;
            }
        }
    }
    // endregion
}
