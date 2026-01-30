package com.cc.java;

public class Circle extends Shape {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override                               
    public double area() {                  // Konkrete Implementierung der abstrakten Methode
        return Math.PI * radius * radius;  // Formel: Pi * r^2
    }
}