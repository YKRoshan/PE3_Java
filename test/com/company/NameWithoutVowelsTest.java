package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class NameWithoutVowelsTest extends StudentMarks {
    NameWithoutVowels nameWithoutVowels;
    private static final String Inp="5";
    ByteArrayInputStream input=new ByteArrayInputStream(Inp.getBytes());
    @Before
    public void setUp() {
        nameWithoutVowels = new NameWithoutVowels();
        System.setIn(input);
    }

    @After
    public void tearDown(){
        nameWithoutVowels = null;
    }

    @Test
    public void nameWithoutVowelsSuccess() {
        String actual = nameWithoutVowels.nameWithoutVowels("India,United States,Germany,Egypt,czechoslovakia");
        String expected = "Ind\n" + "Untd Stts\n" + "Grmny\n" + "Egypt\n" + "czchslvk\n";
        assertEquals(expected,actual);
    }
}