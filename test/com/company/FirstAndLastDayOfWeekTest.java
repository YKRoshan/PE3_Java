package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest extends StudentMarks {

    FirstAndLastDayOfWeek firstAndLastDayOfWeek;
    @Before
    public void setUp() {
        firstAndLastDayOfWeek = new FirstAndLastDayOfWeek();
    }

    @After
    public void tearDown() {
        firstAndLastDayOfWeek = null;
    }

    @Test
    public void firstAndLastDayOfWeekSuccess() {
        String actual = firstAndLastDayOfWeek.firstAndLastDayOfWeek();
        String expected = "Mon 07/01/2019 Sun 13/01/2019";
        assertEquals(expected,actual);
    }
}