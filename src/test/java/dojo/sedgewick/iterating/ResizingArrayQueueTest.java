package dojo.sedgewick.iterating;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResizingArrayQueueTest {

    private static final String[] TEST_ARR = {"a","b","c","d","e"};
    private ResizingArrayQueue<String> queue;

    @BeforeEach
    void setUp() {
        queue = new ResizingArrayQueue<>();
        for (String i: TEST_ARR) {
            queue.enqueue(i);
        }
    }

    @Test
    void test0() {
        for (int i = 0; i < TEST_ARR.length; i++) {
            assertThat(queue.dequeue()).isEqualTo(TEST_ARR[i]);
        }
        assertThat(queue.isEmpty()).isTrue();
    }

    @Test
    @Disabled
    void show() {
        for (String i : queue) {
            System.out.println(i);
        }
    }

}
