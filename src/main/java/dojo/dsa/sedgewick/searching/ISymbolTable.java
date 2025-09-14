package dojo.dsa.sedgewick.searching;

import org.apache.commons.lang3.tuple.Pair;

public interface ISymbolTable<Key extends Comparable<Key>, Value> {
    boolean contains(Key key);
    Value get(Key key);
    void put(Key key, Value value);
    void delete(Key key);
    Iterable<Key> keys();
    Iterable<Value> values();
    Iterable<Pair<Key, Value>> entries();
}
