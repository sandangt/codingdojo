package dojo.dsa.sedgewick.searching;

public class SearchNode<Key extends Comparable<Key>, Value> {
    Key key;
    Value val;
    SearchNode<Key, Value> next;
    SearchNode<Key, Value> left, right;
    int size;

    public SearchNode(Key key, Value val, SearchNode<Key, Value> next)  {
        this.key  = key;
        this.val  = val;
        this.next = next;
    }

    public SearchNode(Key key, Value val, int size) {
        this.key = key;
        this.val = val;
        this.size = size;
    }

}
