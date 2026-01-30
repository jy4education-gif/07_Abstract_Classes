package com.cc.java;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        // 1. Instanziierung (Komplexe Logik ggf. in Variable auslagern für Lesbarkeit)
        double circleRadius = Math.sqrt(12.17) / Math.sqrt(Math.PI);
        
        Circle circle = new Circle(circleRadius);
        Rectangle rectangle = new Rectangle(5.0, 6.0);
        Triangle triangle = new Triangle(3.0, 8.0);

        // 2. Polymorphe Sammlung
        List<Shape> shapes = List.of(circle, rectangle, triangle);

        output("--- Flaechenberechnung ---");
        for (Shape shape : shapes) {
            // Late Binding: Java wählt die spezifische area()-Methode
            output("Flaeche von " + shape.getName() + ": " + shape.area());
        }

        output("------  Differenzen ------");
        // Nutzung der polymorphen areaDiff-Methode
        output("Diff. r-t : " + areaDiff(rectangle, triangle));
        output("Diff. r-c : " + areaDiff(rectangle, circle));
        output("Diff. c-r : " + areaDiff(circle, rectangle));
    }

    /**
     * Berechnet die Differenz zwischen zwei Flächen.
     * Nutzt Polymorphie, um jeden Subtyp von Shape zu verarbeiten.
     */
    private static double areaDiff(Shape s1, Shape s2) {
        return s1.area() - s2.area();
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}