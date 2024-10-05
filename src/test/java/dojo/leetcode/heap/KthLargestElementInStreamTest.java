package dojo.leetcode.heap;

import org.junit.jupiter.api.Test;

import static dojo.leetcode.heap.KthLargestElementInStream.KthLargest;
import static org.assertj.core.api.Assertions.assertThat;

class KthLargestElementInStreamTest {
    @Test
    void testSolution0() {
        var obj = new KthLargest(3, new int[] {4, 5, 8, 2});
        assertThat(obj.add(3)).isEqualTo(4);
        assertThat(obj.add(5)).isEqualTo(5);
        assertThat(obj.add(10)).isEqualTo(5);
        assertThat(obj.add(9)).isEqualTo(8);
        assertThat(obj.add(4)).isEqualTo(8);
    }

    @Test
    void testSolution1() {
        var obj = new KthLargest(4, new int[] {7, 7, 7, 8});
        assertThat(obj.add(2)).isEqualTo(7);
        assertThat(obj.add(10)).isEqualTo(7);
        assertThat(obj.add(9)).isEqualTo(7);
        assertThat(obj.add(9)).isEqualTo(8);
    }

    @Test
    void testSolution2() {
        var obj = new KthLargest(3, new int[] {1, 2, 3, 4});
        assertThat(obj.add(3)).isEqualTo(3);
        assertThat(obj.add(5)).isEqualTo(3);
        assertThat(obj.add(6)).isEqualTo(4);
        assertThat(obj.add(7)).isEqualTo(5);
        assertThat(obj.add(8)).isEqualTo(6);
    }
}
