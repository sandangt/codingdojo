package dojo.dsa.leetcode.linkedlist.helper;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    String display() {
        Queue<Integer> dq = new LinkedList<>();
        dq.add(this.val);
        while (this.next != null) {
            dq.add(this.next.val);
            this.next = this.next.next;
        }
        return "[%s]".formatted(
            dq.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }

}
