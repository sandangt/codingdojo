package dojo.dsa.leetcode.linkedlist;

import dojo.dsa.leetcode.linkedlist.helper.ListNode;

/**
 * easy
 * url: https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    static ListNode solution(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prevNode = null, currentNode = null;
        ListNode nextNode = head;
        while (nextNode != null) {
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
        }
        return currentNode;
    }
}
