package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

public class RectangleTest extends TestCase{
    private Rectangle rectangle;

    protected void setUp() {
        rectangle = new Rectangle(5, 10);
    }

    public void testSetLength() {
        rectangle.set_length(12.2);
//        assertEquals(12.2, rectangle.get_length());
//        assertEquals(10, rectangle.get_width());
        rectangle.get_length();
        rectangle.get_width();
        rectangle.set_length(10);
//        assertEquals(10, rectangle.get_length());
//        assertEquals(10, rectangle.get_width());
        rectangle.get_length();
        rectangle.get_width();
        rectangle.set_length(-1);
//        assertEquals(10, rectangle.get_length());
//        assertEquals(10, rectangle.get_width());
        rectangle.get_length();
        rectangle.get_width();
    }

    public void testSetWdith() {
        rectangle.set_width(2);
//        assertEquals(5, rectangle.get_length());
//        assertEquals(2, Square.get_width());
        rectangle.get_length();
        rectangle.get_width();
        rectangle.set_width(1);
//        assertEquals(1, rectangle.get_length());
//        assertEquals(2, Square.get_width());
        rectangle.get_length();
        rectangle.get_width();
        rectangle.set_length(-2);
//        assertEquals(1, rectangle.get_length());
//        assertEquals(2, Square.get_width());
        rectangle.get_length();
        rectangle.get_width();
    }

    public void testComputeArea() {
        rectangle.set_width(3);
        rectangle.set_length(4);
        rectangle.compute_area();
        //        assertEquals(12, Square.get_length());
        rectangle.set_width(5);
        rectangle.compute_area();
        //        assertEquals(30, Square.get_length());
    }
}
