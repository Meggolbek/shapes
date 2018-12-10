package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

public class OvalTest extends TestCase{
    private Oval oval;

    protected void setUp() {
        oval = new Oval(5, 7);
    }

    public void testSetLongRadius() {
        oval.set_long_radius(12.2);
        assertEquals(12.2, oval.get_long_radius());
        assertEquals(5, oval.get_short_radius());
        oval.get_short_radius();
        oval.get_long_radius();
        oval.set_long_radius(-1);
        assertEquals(12.2, oval.get_long_radius());
        assertEquals(5, oval.get_short_radius());
        oval.get_short_radius();
        oval.get_long_radius();
    }

    public void testCalculateArea() {
        double area = oval.calculate_area();
        assertEquals(area, 109.9);
    }

    public void testScaleArea() {
        double area = oval.scale_area(2);
        assertEquals(area, 219.8);
        area = oval.scale_area(0);
        assertEquals(area, 0);
        area = oval.scale_area(-1);
        assertEquals(area, 109.9);
    }

    public void testAddToLongRadius () {
        oval.add_to_long_radius(2);
        assertEquals(9, oval.get_long_radius());
    }

}