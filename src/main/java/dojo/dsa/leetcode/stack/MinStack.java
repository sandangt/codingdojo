package dojo.dsa.leetcode.stack;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * medium
 * url: https://leetcode.com/problems/min-stack/
 */
public class MinStack {

    private final Stack<Integer> regularStack;
    private final Stack<Integer> minStack;

    public MinStack() {
        regularStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        regularStack.push(val);
        int minVal = minStack.isEmpty() ? val : Math.min(minStack.peek(), val);
        minStack.push(minVal);
    }

    public void pop() {
        regularStack.pop();
        minStack.pop();

    }

    public int top() {
        return regularStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    @Override
    public String toString() {
        String str = regularStack.stream()
            .map(Object::toString)
            .collect(Collectors.joining(", "));
        return "[%s]".formatted(str);
    }

}
