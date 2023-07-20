package codingdojo.sedgewick.Iterating;

import java.util.Optional;


public final class LinkedStack<Item> extends LinkedList<Item> implements IStack<Item> {
    public LinkedStack() {
        super();
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void push(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = head;
        head = newNode;
        n++;
    }

    @Override
    public Optional<Item> pop() {
        if (isEmpty()) return Optional.empty();
        Node returnNode = head;
        head = head.next;
        n--;
        return Optional.ofNullable(returnNode.item);
    }

    @Override
    public Item peek() {
        return head.item;
    }
}
