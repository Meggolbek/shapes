package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

public class ColorTest extends TestCase {

    private Color color;

    protected void setUp() {
        color = new Color();
    }

    public void testSetColor(){
        color.setColor("black");
       // assertEquals("black", color.getColor());
        color.getColor();
        color.setColor("blue");
        // assertEquals("blue", color.getColor());
        color.getColor();
        color.setColor("red");
        // assertEquals("red", color.getColor());
        color.getColor();
    }

}



