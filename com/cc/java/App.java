package com.cc.java;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        // Wir erstellen die konkreten Formen
        Circle circle = new Circle(Math.sqrt(12.17) / Math.sqrt(Math.PI));
        Rectangle rectangle = new Rectangle(5.0, 6.0);
        Triangle triangle = new Triangle(3.0, 8.0);

        // Polymorphismus: Wir speichern alle unterschiedlichen Formen in einer Liste vom Typ "Shape".
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        System.out.println("--- Flaechenberechnung ---");

        // Wir iterieren über die Liste. Die Schleife weiß nur, dass es "Shapes" sind.
        for (Shape shape : shapes) {
                                                                            // Late Binding:Java entscheidet erst zur Laufzeit,
            output("Flaeche von " + shape.getName() + ": " + shape.area()); // welche area()-Methode aufgerufen wird (die vom Kreis, Rechteck oder Dreieck).
        }

        output("------  Differenzen ------");
        output("Diff. r-t :" + areaDiff(rectangle, triangle));
        output("Diff. r-c :" + areaDiff(rectangle, circle));
        output("Diff. c-r: " + areaDiff(circle,rectangle));
        output("Diff. c-t: " + areaDiff(circle, triangle));
        output("Diff. t-t: " + areaDiff(triangle, triangle));

    }

    //    /* 1. Iteration : ggf. 1000x überladen */ 
    // private static double areaDiff(Rectangle r, Triangle t){
    //     return r.area() - t.area();
    // }

       /* 2. Iteration: Polymorphie - besser! */  
    private static double areaDiff(Shape s1, Shape s2){
        return s1.area() - s2.area();
    }
 


    private static void output(String outputStr) {         // Hilfsmethode für die Ausgabe
        System.out.println(outputStr);
    }
}