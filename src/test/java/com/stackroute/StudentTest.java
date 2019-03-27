package com.stackroute;
import org.junit.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertEquals;


public class StudentTest{
    private static Student student;


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        student= new Student();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        student= null;

    }
    @SuppressWarnings("deprecation")
    @Test
    public void testCalculateAverage()
    {
        assertEquals("testCalculateAverage(), calculateAverage does not return correct value "
                ,81.50,student.calculateAverage(new int[] {86,65,98,77}));
        assertEquals("testCalculateAverage(), calculateAverage does not return correct value "
                ,72.50,student.calculateAverage(new int[] {96,60,90,79,45,70,100,40}));
        assertEquals("testCalculateAverage(), calculateAverage does not return correct value "
                ,86.00,student.calculateAverage(new int[] {86}));

    }
    @Test
    public void testCalculateAverageFailure(){
        assertNotNull("testCalculateAverage(), testCalculateAverage does not return correct value "
                ,student.minMarks(new int[] {54,75,99,23,45,67,84}));
        assertNotNull("testCalculateAverage(), testCalculateAverage does not return correct value "
                ,student.minMarks(new int[] {54,75,83,92,76,54,32,21,84}));

    }
    @Test
    public void testMaxMarks()
    {
        assertEquals("testMaxMarks(), maxMarks does not return correct value "
                ,98,student.maxMarks(new int[] {86,65,98,77}));
        assertEquals("testMaxMarks(), maxMarks does not return correct value "
                ,100,student.maxMarks(new int[] {86,65,98,100,76}));
        assertEquals("testMaxMarks(), maxMarks does not return correct value "
                ,44,student.maxMarks(new int[] {44}));
    }
    @Test
    public void testMaxMarksFailure(){

        assertNotNull("testMaxMarks(), maxMarks does not return correct value "
                ,student.maxMarks(new int[] {54}));

        assertNotNull("testMaxMarks(), maxMarks does not return correct value "
                ,student.maxMarks(new int[] {54,72,98,99,54,43,69}));
    }
    @Test
    public void testMinMarks()
    {
        assertEquals("testMinMarks(), minMarks does not return correct value "
                ,65,student.minMarks(new int[] {86,65,98,77}));
        assertEquals("testMinMarks(), minMarks does not return correct value "
                ,14,student.minMarks(new int[] {86,65,98,24,29,78,65,34,99,100,97,98,14}));
        assertEquals("testMinMarks(), minMarks does not return correct value "
                ,54,student.minMarks(new int[] {54}));

    }
    @Test
    public void testMinMarksFailure()
    {
        assertNotNull("testMinMarks(), minMarks does not return correct value "
                ,student.minMarks(new int[] {54}));
        assertNotNull("testMinMarks(), minMarks does not return correct value "
                ,student.minMarks(new int[] {78,90,54,78,33,45,46,71}));
    }
}


