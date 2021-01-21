package PaulinaKsienzyk.com.github.tasks.task5;

import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.Assert.*;

public class MyStackTest {

    @Test
    public void shouldBeEmpty() {
        MyStack<String> myStack = new MyStack<>();
        assertTrue(myStack.isEmpty());
    }

}
