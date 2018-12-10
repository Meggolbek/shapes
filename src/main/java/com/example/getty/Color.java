package com.example.getty;

public class Color {
    private String color;

    public Color(){
        this.color = "white";
    }
    public Color(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = "red";
    }

}
