package codingdojo.neetcode.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
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
