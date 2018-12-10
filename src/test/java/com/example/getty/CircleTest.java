package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

public class CircleTest extends TestCase{
    private Rectangle rectangle;

    protected void setUp() {
        circle = new Circle(5);
    }

    public void testSetShortRadius() {
        circle.set_short_radius(12.2);
        assertEquals(12.2, ircle.get_short_radius());
        circle.get_short_radius();
        circle.set_short_radius(-1);
        assertEquals(12.2, circle.get_short_radius());
        circle.get_short_radius();
    }

    public void testCalculateArea() {
        double area = circle.calculate_area();
        assertEquals(area, 78.5)
    }

}