/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EBikeTest {
    EBike B;

    @Before
    public void setUp() throws Exception {
        B = new EBike();
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, B.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        B.upgradeSpeed();
        assertEquals(7, B.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        B.downgradeSpeed();
        assertEquals(3, B.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals("15", B.getPrice());
    }

}