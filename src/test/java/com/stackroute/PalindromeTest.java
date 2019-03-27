package com.stackroute;

import org.junit.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class PalindromeTest {
    private static Palindrome palindrome;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        palindrome = new Palindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        palindrome= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testCheckPalindrome()
    {
        assertEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , true,palindrome.checkPalindrome("abc123 321cba"));
        assertEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , true,palindrome.checkPalindrome("12345654321"));
        assertEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , true,palindrome.checkPalindrome("ddd aaa cc bbb cc aaa ddd"));
        assertEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , false,palindrome.checkPalindrome("123421"));
        assertEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , false,palindrome.checkPalindrome("stack route"));
        assertEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , false,palindrome.checkPalindrome("123556 123456"));
        assertNotEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , false,palindrome.checkPalindrome("123456 654321"));
        assertNotEquals("testCheckPalindrome(),checkPalindrome does not return correct value "
                , true,palindrome.checkPalindrome("123556"));
    }
    @Test
    public void testCheckPalindromeFailure()
    {

        assertNotNull("testCheckPalindrome(),checkPalindrome does not return correct value ",
                palindrome.checkPalindrome("123 123456"));

        assertNotNull("testCheckPalindrome(),checkPalindrome does not return correct value ",
                palindrome.checkPalindrome("123 156"));
   }


}
