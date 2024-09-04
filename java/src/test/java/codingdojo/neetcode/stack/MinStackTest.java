package codingdojo.neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinStackTest {

    @Test
    void testSolution0() {
        MinStack minStack = new MinStack();
        assertThat(minStack).hasToString("[]");
        minStack.push(-2);
        assertThat(minStack).hasToString("[-2]");
        minStack.push(0);
        assertThat(minStack).hasToString("[-2, 0]");
        minStack.push(-3);
        assertThat(minStack).hasToString("[-2, 0, -3]");
        assertThat(minStack.getMin()).isEqualTo(-3);
        minStack.pop();
        assertThat(minStack).hasToString("[-2, 0]");
        assertThat(minStack.top()).isEqualTo(0);
        assertThat(minStack.getMin()).isEqualTo(-2);
    }

}
