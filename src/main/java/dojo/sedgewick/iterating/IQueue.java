package dojo.sedgewick.iterating;

public interface IQueue<Item> extends IList<Item> {
    void enqueue(Item item);
    Item dequeue();
    Item peek();
}
