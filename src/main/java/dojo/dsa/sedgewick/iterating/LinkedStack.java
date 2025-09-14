package dojo.dsa.sedgewick.iterating;

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
        try {
            Node newNode = new Node();
            newNode.item = item;
            newNode.next = head;
            head = newNode;
        } finally {
            n++;
        }
    }

    @Override
    public Item pop() {
        try {
            if (isEmpty()) return null;
            Node returnNode = head;
            head = head.next;
            return returnNode.item;
        } finally {
            n--;
        }
    }

    @Override
    public Item peek() {
        return head.item;
    }
}
