package PaulinaKsienzyk.com.github.tasks.task5;

import java.util.Stack;

public class MyStack<E> {

    private final Stack<E> stack = new Stack<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public E push(E item) {
        return stack.push(item);
    }

    public E peek() {
        return stack.peek();
    }
}
