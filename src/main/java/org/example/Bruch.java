package org.example;

/**
 * Repräsentiert einen mathematischen Bruch mit Zähler und Nenner.
 * Brüche werden automatisch gekürzt.
 */
public class Bruch {
    private int zaehler;
    private int nenner;

    /**
     * Konstruktor mit Zähler und Nenner.
     * Der Bruch wird automatisch gekürzt.
     *
     * @param z Zähler
     * @param n Nenner (darf nicht 0 sein)
     * @throws IllegalArgumentException wenn Nenner 0 ist
     */
    public Bruch(int z, int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein");
        }
        
        int gcd = ggt(Math.abs(z), Math.abs(n));
        this.zaehler = z / gcd;
        this.nenner = n / gcd;
    }

    /**
     * Standardkonstruktor: erstellt den Bruch 1/2
     */
    public Bruch() {
        this(1, 2);
    }

    /**
     * Konstruktor mit nur Zähler: erstellt Bruch z/1
     *
     * @param z Zähler
     */
    public Bruch(int z) {
        this(z, 1);
    }

    /**
     * Berechnet den größten gemeinsamen Teiler (GGT).
     */
    private static int ggt(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    /**
     * Gibt den Bruch in der Form "z/n" aus
     */
    public void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }

    /**
     * Erweitert den Bruch um den Faktor a
     *
     * @param a Erweiterungsfaktor
     */
    public void erweitern(int a) {
        if (a == 0) {
            throw new IllegalArgumentException("Erweiterungsfaktor darf nicht 0 sein");
        }
        zaehler *= a;
        nenner *= a;
    }

    /**
     * Multipliziert diesen Bruch mit einem anderen Bruch
     *
     * @param other Der andere Bruch
     */
    public void multipliziere(Bruch other) {
        zaehler *= other.zaehler;
        nenner *= other.nenner;
        // Automatisches Kürzen nach Multiplikation
        int gcd = ggt(Math.abs(zaehler), Math.abs(nenner));
        zaehler /= gcd;
        nenner /= gcd;
    }

    /**
     * Addiert einen anderen Bruch zu diesem Bruch
     *
     * @param other Der andere Bruch
     */
    public void addiere(Bruch other) {
        zaehler = zaehler * other.nenner + other.zaehler * nenner;
        nenner = nenner * other.nenner;
        int gcd = ggt(Math.abs(zaehler), Math.abs(nenner));
        zaehler /= gcd;
        nenner /= gcd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bruch bruch)) return false;
        return zaehler == bruch.zaehler && nenner == bruch.nenner;
    }

    @Override
    public int hashCode() {
        return zaehler * 31 + nenner;
    }
}
