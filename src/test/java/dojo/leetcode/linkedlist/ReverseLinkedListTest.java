package dojo.leetcode.linkedlist;

import dojo.leetcode.linkedlist.helper.LinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {
    @Test
    void testSolution0() {
        int[] input = {1,2,3,4,5};
        int[] expected = {5,4,3,2,1};
        var lst = new LinkedList(input);
        var newHead = ReverseLinkedList.solution(lst.getHead());
        var actual = new LinkedList(newHead).toArray();
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testSolution1() {
        int[] input = {1,2};
        int[] expected = {2,1};
        var lst = new LinkedList(input);
        var newHead = ReverseLinkedList.solution(lst.getHead());
        var actual = new LinkedList(newHead).toArray();
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testSolution2() {
        int[] input = {};
        int[] expected = {};
        var lst = new LinkedList(input);
        var newHead = ReverseLinkedList.solution(lst.getHead());
        var actual = new LinkedList(newHead).toArray();
        assertThat(actual).isEqualTo(expected);
    }
}
