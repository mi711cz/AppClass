package org.example;

/**
 * Hauptklasse für die Bruch-Anwendung
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Bruch-Rechner mit Java 21 ===\n");

        // Beispiel 1: Einfache Brüche
        Bruch b1 = new Bruch(6, 27);
        System.out.println("Bruch b1 (6/27 gekürzt): " + b1);

        Bruch b2 = new Bruch(4);
        System.out.println("Bruch b2 (4/1): " + b2);

        // Beispiel 2: Erweiterung
        Bruch b3 = new Bruch(1, 2);
        System.out.println("\nOriginal: " + b3);
        b3.erweitern(4);
        System.out.println("Nach Erweiterung um 4: " + b3);

        // Beispiel 3: Multiplikation
        Bruch b4 = new Bruch(2, 3);
        Bruch b5 = new Bruch(3, 4);
        System.out.println("\nMultiplikation: " + b4 + " * " + b5);
        b4.multipliziere(b5);
        System.out.println("Ergebnis: " + b4);

        // Beispiel 4: Addition
        Bruch b6 = new Bruch(1, 3);
        Bruch b7 = new Bruch(1, 6);
        System.out.println("\nAddition: " + b6 + " + " + b7);
        b6.addiere(b7);
        System.out.println("Ergebnis: " + b6);
    }
}
