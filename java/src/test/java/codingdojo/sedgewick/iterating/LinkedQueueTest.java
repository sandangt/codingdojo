package codingdojo.sedgewick.iterating;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class LinkedQueueTest {
    private static final int[] TEST_ARR = {1,2,3,4,5,6,7};
    private LinkedQueue<Integer> queue;

    @BeforeEach
    public void init() {
        queue = new LinkedQueue<>();
        for (int i : TEST_ARR) {
            queue.enqueue(i);
        }
    }

    @Test
    public void test0() {
        assertThat(queue.size()).isEqualTo(TEST_ARR.length);
        for (int i : TEST_ARR) {
            assertThat(queue.dequeue().orElse(null)).isEqualTo(i);
        }
        assertThat(queue.isEmpty()).isTrue();
    }

    @Test
    public void test1() {
        queue.reverse();
        for (int i = TEST_ARR.length - 1; i >= 0; i--) {
            assertThat(queue.dequeue().orElse(null)).isEqualTo(TEST_ARR[i]);
        }
        assertThat(queue.isEmpty()).isTrue();
    }

    @Test
    @Disabled
    public void show() {
        System.out.println("Origin:");
        for (Integer i : queue) {
            System.out.println(i);
        }
        queue.reverse();
        System.out.println("Reversed:");
        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}
