package codingdojo.sedgewick.iterating;

import java.util.Optional;


public interface IStack<Item> extends IList<Item> {
    void push(Item item);
    Optional<Item> pop();
    Item peek();
}
