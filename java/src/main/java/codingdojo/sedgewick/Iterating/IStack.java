package codingdojo.sedgewick.Iterating;

import java.util.Optional;


public interface IStack<Item> extends IList<Item> {
    void push(Item item);
    Optional<Item> pop();
    Item peek();
}
