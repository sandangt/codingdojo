package dojo.leetcode.linkedlist.helper;

import java.util.Arrays;

public class LinkedList {
    private int n;
    private ListNode head;

    public LinkedList() {
        head = null;
        n = 0;
    }

    public LinkedList(int[] arr) {
        if (arr.length == 0) {
            head = null;
            n = 0;
            return;
        }
        head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i=1; i<arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        n = arr.length;
    }

    public LinkedList(ListNode listHead) {
        for (var current=listHead; current!=null; current=current.next) {
            this.n++;
        }
        this.head = listHead;
    }

    public ListNode getHead() {
        return head;
    }

    public int[] toArray() {
        int[] result = new int[n];
        int i = 0;
        for (var current=head; current!=null; current=current.next) {
            result[i] = current.val;
            i++;
        }
        return result;
    }

    boolean isIdentical(LinkedList anotherList) {
        int[] thisArr = toArray();
        int[] anotherArr = anotherList.toArray();
        return Arrays.equals(thisArr, anotherArr);
    }

}
