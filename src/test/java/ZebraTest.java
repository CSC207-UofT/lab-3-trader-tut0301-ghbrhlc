import org.junit.*;

import static org.junit.Assert.*;

public class ZebraTest {
    Zebra z;

    @Before
    public void setUp() throws Exception {
        z = new Zebra(40);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Zaaaaa!", z.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(40, z.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        z.upgradeSpeed();
        assertEquals(2, z.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        int current = z.getMaxSpeed();
        current = current - 1;
        z.downgradeSpeed();
        assertEquals(current, z.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, z.getPrice());
    }
}
