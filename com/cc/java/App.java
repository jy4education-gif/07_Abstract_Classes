package com.cc.java;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        // Wir erstellen verschiedene konkrete Formen
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 8.0);

        // Polymorphismus in Aktion:
        // Wir speichern alle unterschiedlichen Formen in einer Liste vom Typ "Shape".
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        System.out.println("--- Flächenberechnung ---");

        // Wir iterieren über die Liste. Die Schleife weiß nur, dass es "Shapes" sind.
        for (Shape shape : shapes) {
            // Der "magische" Moment (Late Binding):
            // Java entscheidet erst zur Laufzeit, WELCHE area()-Methode aufgerufen wird
            // (die vom Kreis, Rechteck oder Dreieck).
            output("Fläche von " + shape.getName() + ": " + shape.area());
        }
    }

    // Hilfsmethode für die Ausgabe
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}