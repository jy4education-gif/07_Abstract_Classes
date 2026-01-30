package com.cc.java;

public class Rectangle extends Shape {
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // Formel: Breite * Höhe
        return width * height;
    }
}