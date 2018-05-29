package com.example.getty;

public class Rectangle extends quadrilateral {
    private double length;
    private double width;
    private Color color;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
        this.color = new Color();
    }

    public void set_length(double len){
        this.length = len;
    }

    public void set_width(double w){
        this.width = w;
        this.color.setColor("green");
    }
}
