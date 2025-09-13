package dojo.dsa.leetcode.linkedlist;

import dojo.dsa.leetcode.linkedlist.helper.ListNode;

/**
 * medium
 * url: https://leetcode.com/problems/reorder-list/
 */
public class ReorderList {
    static void solution(ListNode head) {
        if (head == null || head.next == null) return;
        // region Find middle node of linked list
        ListNode slowPtr = head;
        ListNode preSlowPtr = null;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            preSlowPtr = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        preSlowPtr.next = null;
        // endregion
        // region Reverse second half of linked list
        ListNode nextNode = slowPtr, currentNode = null, prevNode = null;
        while (nextNode != null) {
            currentNode = nextNode;
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
        }
        // endregion
        // region Merge two list
        ListNode ptr = head, first = head.next, second = currentNode;
        while (first != null || second != null) {
            if (second != null) {
                ptr.next = second;
                ptr = ptr.next;
                second = second.next;
            }
            if (first != null) {
                ptr.next = first;
                ptr = ptr.next;
                first = first.next;
            }
        }
        // endregion
    }
}
