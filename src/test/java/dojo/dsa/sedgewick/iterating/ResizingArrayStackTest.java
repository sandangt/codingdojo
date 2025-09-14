package dojo.dsa.sedgewick.iterating;

import static org.assertj.core.api.Assertions.assertThat;

import dojo.dsa.sedgewick.iterating.ResizingArrayStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class ResizingArrayStackTest {

    private static final String[] TEST_ARR = {"a","b","c","d","e"};
    private ResizingArrayStack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new ResizingArrayStack<>();
        for (String i : TEST_ARR) {
            stack.push(i);
        }
    }

    @Test
    void test0() {
        for (int i = TEST_ARR.length - 1; i >= 0; i--) {
            assertThat(stack.pop()).isEqualTo(TEST_ARR[i]);
        }
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @Disabled
    void show() {
        for (String i : stack) {
            System.out.println(i);
        }
    }
}
