package dojo.leetcode.linkedlist;

import dojo.leetcode.linkedlist.helper.LinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {
    @Test
    void testSolution0() {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
        int[] expected = {1,1,2,3,4,4};
        var lst1 = new LinkedList(arr1).getHead();
        var lst2 = new LinkedList(arr2).getHead();
        var newHead = MergeTwoSortedLists.solution(lst1, lst2);
        var actual = new LinkedList(newHead).toArray();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        var lst1 = new LinkedList(arr1).getHead();
        var lst2 = new LinkedList(arr2).getHead();
        var newHead = MergeTwoSortedLists.solution(lst1, lst2);
        var actual = new LinkedList(newHead).toArray();
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testSolution2() {
        int[] arr1 = {};
        int[] arr2 = {0};
        int[] expected = {0};
        var lst1 = new LinkedList(arr1).getHead();
        var lst2 = new LinkedList(arr2).getHead();
        var newHead = MergeTwoSortedLists.solution(lst1, lst2);
        var actual = new LinkedList(newHead).toArray();
        assertThat(actual).isEqualTo(expected);
    }
}
