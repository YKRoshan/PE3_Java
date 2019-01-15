package com.stackroute.pe3_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class AdditionOfTwoMatricesTest extends StudentMarks {

    private static final String Inp="1 2 3 4 5 6 9 8 7 6 5 4";
    ByteArrayInputStream input=new ByteArrayInputStream(Inp.getBytes());
    AdditionOfTwoMatrices additionOfTwoMatrices;
    @Before
    public void setUp() {
        additionOfTwoMatrices = new AdditionOfTwoMatrices();
        System.setIn(input);
    }

    @After
    public void tearDown() {
        additionOfTwoMatrices = null;
    }

    @Test
    public void additionOfTwoMatricesSuccess() {
        float [][] actual = additionOfTwoMatrices.additionOfTwoMatrices(3,2);
        float [][] expected = new float[][]{{10,10},{10,10},{10,10}};
        assertArrayEquals(actual,expected);
    }
}