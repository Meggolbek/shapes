package com.example.getty;

public class Rectangle extends quadrilateral {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        this.length = w+1;
        this.width = w;
    }

    public void set_length(double len){
        this.length = this.width+1;
    }

    public void set_width(double w){
        this.width = w;
        this.length = w + 1;
    }
}
