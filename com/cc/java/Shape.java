package com.cc.java;

public abstract class Shape {       // Das Schlüsselwort "abstract" verhindert, dass man "new Shape()" aufrufen kann.

    public abstract double area();  // Die abstrakte Methode: Nur die Signatur (Kopf), kein Rumpf {}.
                                    // Dies ist der "Vertrag": Jede Subklasse MUSS diese Methode implementieren.
    public String getName() {       // Optional: Eine Methode, um den Namen der Klasse für die Ausgabe zu holen
        return this.getClass().getSimpleName();
    }
}