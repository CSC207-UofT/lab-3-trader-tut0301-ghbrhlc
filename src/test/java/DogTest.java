import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DogTest {
    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof!", d.sound());
    }


    @Test(timeout = 50)
    public void TestPriceUp() {
        d.price_up(5);
        assertEquals(15, d.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(15, d.getPrice());
    }

}
