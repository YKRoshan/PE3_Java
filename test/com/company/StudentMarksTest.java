package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertArrayEquals;

public class StudentMarksTest extends StudentMarks {

    StudentMarks studentMarks ;
    String inp = "65 70 80 68 88 72 56 80 77 58 74 90 92 88 79";
    ByteArrayInputStream input = new ByteArrayInputStream(inp.getBytes());
    @Before
    public void setUp() {
        studentMarks = new StudentMarksTest();
        System.setIn(input);
    }
    @After
    public void tearDown() {
        studentMarks = null;
    }

    @Test
    public void studentMarksSuccess() {
        float [][] actual = studentMarks.studentMarks(3);
        float [][] expected = {{65,70,80,68,88},{72,56,80,77,58},{74,90,92,88,79}};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void studentMarks() {
    }
}