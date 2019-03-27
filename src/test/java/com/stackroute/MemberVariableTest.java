package com.stackroute;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
public class MemberVariableTest{
    private static MemberVariable memberVariable;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        memberVariable = new MemberVariable();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        memberVariable= null;

    }
    @SuppressWarnings("deprecation")
   @Test
    public void testMemberVariableName()
    {
        assertEquals("testMemberVariableName() returned incorrect value","John",memberVariable.Name("John"));
        assertEquals("testMemberVariableName() returned incorrect value","Jaswanth",memberVariable.Name("Jaswanth"));
        assertNotEquals("testMemberVariableName() returned incorrect value","Jas",memberVariable.Name("Jaswanth"));
    }
    @Test
    public void testMemberVariableNameFailure()
    {
        assertNotNull("testMemberVariableName() returned incorrect value",memberVariable.Name("John"));
    }
    @Test
    public void testMemberVariableAge()
    {
        assertEquals("testMemberVariableAge() returned incorrect value",20,memberVariable.Age(20));
        assertEquals("testMemberVariableAge() returned incorrect value",21,memberVariable.Age(21));
        assertNotEquals("testMemberVariableAge() returned incorrect value",25,memberVariable.Age(21));
    }
    @Test
    public void testMemberVariableAgeFailure()
    {
        assertNotNull("testMemberVariableAgeFailure() returned incorrect value",memberVariable.Age(25));
    }
    @Test
    public void testMemberVariableSalary()
    {
        assertEquals("testMemberVariableSalary() returned incorrect value",150000.00,memberVariable.Salary(150000.00));
        assertEquals("testMemberVariableSalary() returned incorrect value",350000.00,memberVariable.Salary(350000.00));
        assertNotEquals("testMemberVariableSalary() returned incorrect value",35.00,memberVariable.Salary(5500.00));
    }
    @Test
    public void testMemberVariableSalaryFailure()
    {
        assertNotNull("testMemberVariableSalaryFailure() returned incorrect value",memberVariable.Salary(2500.00));
    }
}

