package dojo.dsa.sedgewick.iterating;

import java.util.Iterator;


public class LinkedList<Item> implements Iterable<Item>{
    protected int n;
    protected Node head;

    protected class Node {
        protected Item item;
        protected Node next;
    }

    public LinkedList() {
        head = null;
        n = 0;
    }

    public void reverse() {
        if (head == null || n == 1) return;
        Node prevNode = null, currentNode = head, nextNode = head;
        while (nextNode != null) {
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
        }
        head = currentNode;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }

    protected class LinkedIterator implements Iterator<Item> {
        Node travelNode;
        private LinkedIterator() {
            travelNode = head;
        }

        @Override
        public boolean hasNext() {
            return travelNode != null;
        }

        @Override
        public Item next() {
            Node returnNode = travelNode;
            travelNode = travelNode.next;
            return returnNode.item;
        }
    }
}
