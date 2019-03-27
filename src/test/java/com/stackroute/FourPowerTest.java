package com.stackroute;

import org.junit.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class FourPowerTest{
    private static FourPower fourPower;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        fourPower = new FourPower();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fourPower= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testCheckFourPower()
    {
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , true,fourPower.checkFourPower(64));
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , true,fourPower.checkFourPower(256));
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , true,fourPower.checkFourPower(262144));
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , true,fourPower.checkFourPower(1048576));

        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , false,fourPower.checkFourPower(20));
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , false,fourPower.checkFourPower(0));
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , false,fourPower.checkFourPower(-4));
        assertEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , false,fourPower.checkFourPower(1000000));

        assertNotEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , false,fourPower.checkFourPower(256));

        assertNotEquals("testCheckFourPower(),checkFourPower does not return correct value "
                , true,fourPower.checkFourPower(1000000));

    }
    @Test
    public void testCheckFourPowerFailure()
    {
        assertNotNull("testCheckFourPower(), checkFourPower does not return correct value "
                ,fourPower.checkFourPower(678));
        assertNotNull("testCheckFourPower(), checkFourPower does not return correct value "
                ,fourPower.checkFourPower(8888));

    }


}

