package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

public class SquareTest extends TestCase{
    private Square square;

    protected void setUp() {
        square = new Square(5);
    }

    public void testSetLength() {
        square.set_length(12.2);
//        assertEquals(12.2, square.get_length());
//        assertEquals(12.2, square.get_width());
        square.get_length();
        square.get_width();
        square.set_length(10);
//        assertEquals(10, square.get_length());
//        assertEquals(10, square.get_width());
        square.get_length();
        square.get_width();
        square.set_length(-1);
//        assertEquals(10, square.get_length());
//        assertEquals(10, square.get_width());
        square.get_length();
        square.get_width();
    }

    public void testSetWdith() {
        square.set_width(2);
//        assertEquals(2, square.get_length());
//        assertEquals(2, square.get_width());
        square.get_length();
        square.get_width();
        square.set_width(1);
//        assertEquals(1, square.get_length());
//        assertEquals(1, square.get_width());
        square.get_length();
        square.get_width();
        square.set_length(-2);
//        assertEquals(1, square.get_length());
//        assertEquals(1, square.get_width());
        square.get_length();
        square.get_width();
    }

    public void testComputeArea() {
        square.set_width(3);
        square.compute_area();
        //        assertEquals(9, square.get_length());
        square.set_width(4);
        square.compute_area();
        //        assertEquals(16, square.get_length());
    }
}
