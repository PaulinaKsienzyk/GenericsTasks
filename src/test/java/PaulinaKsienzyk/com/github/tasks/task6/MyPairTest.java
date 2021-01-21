package PaulinaKsienzyk.com.github.tasks.task6;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Objects;

import static org.testng.Assert.*;

public class MyPairTest {

    private final Sock sock1 = new Sock();
    private final Sock sock2 = new Sock();

    @Test
    public void shouldAcceptTwoItemsOfTheSameType() {
        MyPair<Sock,Sock> socksPair = new MyPair<>(sock1,sock2);

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(Objects.nonNull(socksPair.getKey()));
        sa.assertTrue(Objects.nonNull(socksPair.getValue()));

        sa.assertAll();
    }

    @Test
    public void shouldNotAcceptsNulls() {
        assertThrows(NullPointerException.class, () -> new MyPair<>(null, null));
    }


}
