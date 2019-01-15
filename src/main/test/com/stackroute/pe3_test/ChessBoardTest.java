package com.stackroute.pe3_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest extends StudentMarks {

    ChessBoard chessBoard;
    @Before
    public void setUp() {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        chessBoard = null;
    }

    @Test
    public void chessBoardSuccess() {
        String actual = chessBoard.chessBoard();
        String expected ="WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n";
        assertEquals(expected,actual);
    }
}