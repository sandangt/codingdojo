package dojo.sedgewick.iterating;

public final class LinkedQueue<Item> extends LinkedList<Item> implements IQueue<Item> {
    /**
     * [head] -> [node0] -> [node1] -> [tail]
     * enqueue: [head] -> [node0] -> [node1] -> [oldTail] -> [newNode / tail]
     * dequeue: [oldHead] | [head] -> [node1] -> [tail]
     */
    private Node tail;

    public LinkedQueue() {
        super();
        tail = null;
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
    public void enqueue(Item item) {
        try {
            Node newNode = new Node();
            newNode.item = item;
            if (isEmpty()) {
                tail = newNode;
                head = newNode;
                return;
            }
            tail.next = newNode;
            tail = tail.next;
        } finally {
            n++;
        }
    }

    @Override
    public Item dequeue() {
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

    @Override
    public void reverse() {
        super.reverse();
        Node travelNode = head;
        while (travelNode.next != null) {
            travelNode = travelNode.next;
        }
        tail = travelNode;
    }
}
