package dojo.dsa.leetcode.linkedlist;

import dojo.dsa.leetcode.linkedlist.helper.LinkedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderListTest {

    @Test
    void testSolution0() {
        int[] input = {1,2,3,4};
        int[] expected = {1,4,2,3};
        var lst = new LinkedList(input);
        ReorderList.solution(lst.getHead());
        assertThat(lst.toArray()).isEqualTo(expected);
    }

    @Test
    void testSolution1() {
        int[] input = {1,2,3,4,5};
        int[] expected = {1,5,2,4,3};
        var lst = new LinkedList(input);
        ReorderList.solution(lst.getHead());
        assertThat(lst.toArray()).isEqualTo(expected);
    }
}
