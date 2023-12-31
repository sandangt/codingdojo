package codingdojo.sedgewick.iterating;

import java.util.Optional;


public interface IQueue<Item> extends IList<Item> {
    void enqueue(Item item);
    Optional<Item> dequeue();
    Item peek();
}
