package dojo.dsa.sedgewick.searching;

import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class SequentialSearch<Key extends Comparable<Key>, Value> implements ISymbolTable<Key, Value> {

    private int n;
    private SearchNode<Key, Value> head;


    public SequentialSearch() {}

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    @Override
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        for (var x = head; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }

    @Override
    public void put(Key key, Value value) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (value == null) {
            delete(key);
            return;
        }

        for (var x = head; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = value;
                return;
            }
        }
        head = new SearchNode<>(key, value, head);
        n++;
    }

    @Override
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        head = delete(head, key);
    }

    private SearchNode<Key, Value> delete(SearchNode<Key, Value> x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

    @Override
    public Iterable<Key> keys()  {
        Queue<Key> queue = new LinkedList<>();
        for (var x = head; x != null; x = x.next)
            queue.offer(x.key);
        return queue;
    }

    @Override
    public Iterable<Value> values()  {
        Queue<Value> queue = new LinkedList<>();
        for (var x = head; x != null; x = x.next)
            queue.offer(x.val);
        return queue;
    }

    @Override
    public Iterable<Pair<Key, Value>> entries()  {
        Queue<Pair<Key, Value>> queue = new LinkedList<>();
        for (var x = head; x != null; x = x.next)
            queue.offer(Pair.of(x.key, x.val));
        return queue;
    }

}
