package dojo.leetcode.linkedlist;

import dojo.leetcode.linkedlist.helper.ListNode;

/**
 * easy
 * url: https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    static ListNode solution(ListNode lst1, ListNode lst2) {
        return merge(lst1, lst2);
    }

    private static ListNode merge(ListNode lst1, ListNode lst2) {
        if (lst1 == null) return lst2;
        if (lst2 == null) return lst1;
        ListNode current;
        if (lst1.val > lst2.val) {
            current = lst2;
            current.next = merge(lst1, lst2.next);
        } else {
            current = lst1;
            current.next = merge(lst1.next, lst2);
        }
        return current;
    }
}
