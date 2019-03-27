package com.stackroute;
import org.junit.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class EvenTest{
    private static Even even;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        even = new Even();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        even= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testCheckFourPower()
    {
        assertEquals("testCheckIsEven(),checkIsEven does not return correct value "
                , true,even.checkIsEven(64));
        assertEquals("testCheckIsEven(),checkIsEven does not return correct value "
                , true,even.checkIsEven(24));
        assertEquals("testCheckIsEven(),checkIsEven does not return correct value "
                , true,even.checkIsEven(-20));
        assertEquals("testCheckIsEven(),checkIsEven does not return correct value "
                , false,even.checkIsEven(11));
        assertEquals("testCheckIsEven(),checkIsEven does not return correct value "
                , false ,even.checkIsEven(-1));
        assertEquals("testCheckIsEven(),checkIsEven does not return correct value "
                , false,even.checkIsEven(11111111));
        assertNotEquals("testCheckIsEven(),checkIsEven does not return correct value",
                true,even.checkIsEven(123));

        assertNotEquals("testCheckIsEven(),checkIsEven does not return correct value",
                false,even.checkIsEven(12));

    }
    @Test
    public void testCheckFourPowerFailure()
    {
        assertNotNull("testCheckIsEven(),checkIsEven does not return correct value ",
                even.checkIsEven(44));
        assertNotNull("testCheckIsEven(),checkIsEven does not return correct value ",
                even.checkIsEven(77));

    }
    }

