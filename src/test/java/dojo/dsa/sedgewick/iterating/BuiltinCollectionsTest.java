package dojo.dsa.sedgewick.iterating;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import org.junit.jupiter.api.Test;


class BuiltinCollectionsTest {
    @Test
    void playWithArrayList() {
        List<String> lst = new ArrayList<>();
        lst.addAll(List.of(new String[] {"a", "b", "c", "d"}));
        lst.forEach(System.out::println);
    }

    @Test
    void playWithStack() {
        Stack<String> st = new Stack<>();
        st.push("a");
        st.push("b");
        st.push("c");
        st.forEach(System.out::println);
    }

    @Test
    void playWithQueue() {
        // region Array dequeue implementation of Queue
        Queue<String> queue1 = new ArrayDeque<>();
        queue1.addAll(List.of(new String[] {"a", "b", "c"}));
        System.out.println(queue1.peek());
        // endregion

        // region Priority Queue implementation of Queue
        Queue<String> queue2 = new PriorityQueue<>();
        // endregion
    }
}
