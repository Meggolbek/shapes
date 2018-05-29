package com.example.getty;

public abstract class quadrilateral implements quadrilateral_length, quadrilateral_width {
    private double length;
    private double width;

    public quadrilateral(){
        this.length = 0;
        this.width = 0;
    }

    public double get_length(){
        return length;
    }
    public double get_width(){
        return width;
    }
    public  double compute_area(){
        return length * width + 1;
    }
}
