package com.example.getty;

public class Oval extends Circle{
    private double long_radius;

    public Oval(double sr, double lr){
        this.short_radius = sr;
        this.long_radius = lr;
    }

    public Oval() {
        this.long_radius = 0;
        this.short_radius = 0;
    }

    public Oval(double sr) {
        this.short_radius = sr;
        this.long_radius = 0;
    }

    public get_long_radius() {
        return this.long_radius;
    }

    public double calculate_area() {
        return this.short_radius * this.long_radius * 3.14;
    }

    public double scale_area(double x) {
        if (x >= 0) {
            return this.calculate_area() * x;
        }
    }

    public void set_long_radius (double x) {
        this.long_radius = x;
    }

    public void add_to_long_radius (double x) {
        this.long_radius = this.long_radius + x;
    }
}
