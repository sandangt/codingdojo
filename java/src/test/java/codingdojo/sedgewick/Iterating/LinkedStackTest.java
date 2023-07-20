package codingdojo.sedgewick.Iterating;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class LinkedStackTest {
    private static final int[] TEST_ARR = {1,2,3,4,5,6,7};
    private LinkedStack<Integer> stack;

    @BeforeEach
    public void init() {
        stack = new LinkedStack<>();
        for (int i : TEST_ARR) {
            stack.push(i);
        }
    }

    @Test
    public void test0() {
        assertThat(stack.size()).isEqualTo(TEST_ARR.length);
        for (int i = TEST_ARR.length - 1; i >= 0; i--) {
            assertThat(stack.pop().orElse(null)).isEqualTo(TEST_ARR[i]);
        }
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void test1() {
        stack.reverse();
        for (int i : TEST_ARR) {
            assertThat(stack.pop().orElse(null)).isEqualTo(i);
        }
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @Disabled
    public void show() {
        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}
