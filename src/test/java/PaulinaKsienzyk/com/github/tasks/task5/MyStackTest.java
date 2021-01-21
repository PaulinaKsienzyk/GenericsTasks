package PaulinaKsienzyk.com.github.tasks.task5;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStackTest {

    private MyStack<String> myStack;

    @BeforeClass
    public void init() {
        myStack = new MyStack<>();;
    }

    @Test
    public void shouldBeEmpty() {
        MyStack<String> emptyStack = new MyStack<>();
        assertTrue(emptyStack.isEmpty());
    }

    @Test(dataProvider = "items")
    public void shouldBeAbleToAddItem(String item) {
        myStack.push(item);
        assertFalse(myStack.isEmpty());
    }

    @Test(dependsOnMethods = "shouldBeAbleToAddItem")
    public void afterPushItemShouldBeOnTheTop() {
        String expectedValue = "hi, there";
        String actualValue = myStack.peek();
        assertEquals(expectedValue, actualValue);
    }

    @DataProvider
    public Object[][] items() {
        return new Object[][]{
                {"hallo"}, {"hello"}, {"hi, there"}
        };
    }

}
