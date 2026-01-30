package com.cc.java;

public class Circle extends Shape {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Konkrete Implementierung der abstrakten Methode
    @Override
    public double area() {
        // Formel: Pi * r^2
        return Math.PI * radius * radius;
    }
}