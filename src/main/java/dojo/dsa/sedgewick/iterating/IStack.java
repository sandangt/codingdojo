package dojo.dsa.sedgewick.iterating;

public interface IStack<Item> extends IList<Item> {
    void push(Item item);
    Item pop();
    Item peek();
}
