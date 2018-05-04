package com.example.getty;

public class Square extends quadrilateral{
    private double length;
    private double width;

    public Square(double l){
        this.length = l;
        this.width = l;
    }

    public void set_length(double len){
        if(len >= 0) {
            this.width = len;
            this.length = len;
        }
    }

    public void set_width(double w){
        if(w >= 0) {
            this.width = w;
            this.length = w;
        }
    }
}
