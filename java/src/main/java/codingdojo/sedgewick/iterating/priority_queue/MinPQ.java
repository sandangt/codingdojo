package codingdojo.sedgewick.iterating.priority_queue;

import java.util.Comparator;
import java.util.Iterator;


public class MinPQ<Item extends Comparable<Item>> implements Iterable<Item> {
    private static final int DEFAULT_CAPACITY = 10;
    private Item[] pq;
    private int n;
    private Comparator<Item> comparator;

    public MinPQ(int capacity) {
        pq = (Item[]) new Comparable[capacity];
        n = 0;
    }

    public MinPQ() {
        this(DEFAULT_CAPACITY);
    }

    public MinPQ(int capacity, Comparator<Item> comparator) {
        this.comparator = comparator;
        pq = (Item[]) new Comparable[capacity];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void peek() {
//        throw NotImplementedException("How");
        System.out.println();
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
