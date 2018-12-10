package com.example.getty;

public class Circle{
    private double short_radius;

    public Circle(double sr){
        if (sr >= 0 ) {
            this.short_radius = sr;
        } else {
            this.short_radius = 0;
        }
    }

    public Circle() {
        this.short_radius = 0;
    }

    public set_short_radius(double sr) {
        if (sr >= 0) {
            this.short_radius = sr;
        }
    }

    public double get_short_radius() {
        return short_radius;
    }

    public double calculate_area() {
        return this.short_radius * this.short_radius * 3.14;
    }
}