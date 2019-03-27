package com.stackroute;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;



public class FactorialTest {
    private static Factorial factorial;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        factorial = new Factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        factorial= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testCheckFactorialInt()
    {
        assertEquals("testCheckFactorialInt(),checkFactorialInt does not return correct value "
                ,120,factorial.checkFactorialInt(5));
        assertEquals("testCheckFactorialInt(),checkFactorialInt does not return correct value "
                ,  479001600,factorial.checkFactorialInt(12));

        assertEquals("testCheckFactorialInt() exceeded the range "
                ,  0,factorial.checkFactorialInt(14));

        assertNotEquals("testCheckFactorialInt(),checkFactorialInt does not return correct value "
                , 200,factorial.checkFactorialInt(12));
    }
    @Test
    public void testCheckFactorialIntFailure()
    {
        assertNotNull("testCheckFactorialInt(),checkFactorialInt does not return correct value ",
                factorial.checkFactorialInt(25));
    }

    @Test
    public void testCheckFactorialLong()
    {
        assertEquals("testCheckFactorialLong(),checkFactorialLong does not return correct value "
                , 120 ,factorial.checkFactorialLong(5));
        assertEquals("testCheckFactorialLong(),checkFactorialLong does not return correct value "
                , 2432902008176640000l,factorial.checkFactorialLong(20));
        assertEquals("testCheckFactorialLong() exceeded the range "
                ,  0,factorial.checkFactorialLong(24));
        assertNotEquals("testCheckFactorialLong(),checkFactorialLong does not return correct value "
                , 2432,factorial.checkFactorialLong(10));


    }
    @Test
    public void testCheckFactorialLongFailure()
    {
        assertNotNull("testCheckFactorialLong(),checkFactorialLong does not return correct value ",
                factorial.checkFactorialLong(25));
    }

}
