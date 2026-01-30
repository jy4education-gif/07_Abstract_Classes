package com.cc.java;

// Das Schlüsselwort "abstract" verhindert, dass man "new Shape()" aufrufen kann.
public abstract class Shape {

    // Die abstrakte Methode: Nur die Signatur (Kopf), kein Rumpf {}.
    // Dies ist der "Vertrag": Jede Subklasse MUSS diese Methode implementieren.
    public abstract double area();
    
    // Optional: Eine Methode, um den Namen der Klasse für die Ausgabe zu holen
    public String getName() {
        return this.getClass().getSimpleName();
    }
}