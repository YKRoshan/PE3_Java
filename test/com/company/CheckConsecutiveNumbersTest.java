package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveNumbersTest extends StudentMarks {

    CheckConsecutiveNumbers checkConsecutiveNumbers;
    @Before
    public void setUp() {
        checkConsecutiveNumbers = new CheckConsecutiveNumbers();
    }

    @After
    public void tearDown() {
        checkConsecutiveNumbers = null;
    }

    @Test
    public void checkConsecutiveNumbersSuccess1() {
    String actual = checkConsecutiveNumbers.checkConsecutiveNumbers("54,53,52,51,50,49,48");
    String expected = "Consecutive numbers";
    assertEquals(expected,actual);
    }
    @Test
    public void checkConsecutiveNumbersSuccess2() {
        String actual = checkConsecutiveNumbers.checkConsecutiveNumbers("98,96,95,94,93");
        String expected = "Non consecutive numbers.";
        assertEquals(expected,actual);
    }
    @Test
    public void checkConsecutiveNumbersSuccess3() {
        String actual = checkConsecutiveNumbers.checkConsecutiveNumbers("1,2,3,4,5,6,6");
        String expected = "Non consecutive numbers.";
        assertEquals(expected,actual);
    }
}