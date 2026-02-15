package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Tests für die Bruch-Klasse
 */
@DisplayName("Bruch Tests")
public class AppTest {

    @Test
    @DisplayName("Konstruktor mit Zähler und Nenner")
    void testBruchConstructor() {
        Bruch b = new Bruch(3, 4);
        assertEquals(3, b.getZaehler());
        assertEquals(4, b.getNenner());
    }

    @Test
    @DisplayName("Automatisches Kürzen im Konstruktor")
    void testBruchAutoKuerzen() {
        Bruch b = new Bruch(6, 9);
        assertEquals(2, b.getZaehler());
        assertEquals(3, b.getNenner());
    }

    @Test
    @DisplayName("Standardkonstruktor")
    void testBruchDefaultConstructor() {
        Bruch b = new Bruch();
        assertEquals(1, b.getZaehler());
        assertEquals(2, b.getNenner());
    }

    @Test
    @DisplayName("Konstruktor mit nur Zähler")
    void testBruchSingleIntConstructor() {
        Bruch b = new Bruch(5);
        assertEquals(5, b.getZaehler());
        assertEquals(1, b.getNenner());
    }

    @Test
    @DisplayName("Nenner 0 wirft Exception")
    void testBruchNennerNull() {
        assertThrows(IllegalArgumentException.class, () -> new Bruch(1, 0));
    }

    @Test
    @DisplayName("Erweiterung eines Bruchs")
    void testErweitern() {
        Bruch b = new Bruch(1, 2);
        b.erweitern(3);
        assertEquals(3, b.getZaehler());
        assertEquals(6, b.getNenner());
    }

    @Test
    @DisplayName("Multiplikation zweier Brüche")
    void testMultipliziere() {
        Bruch b1 = new Bruch(2, 3);
        Bruch b2 = new Bruch(3, 4);
        b1.multipliziere(b2);
        assertEquals(1, b1.getZaehler());
        assertEquals(2, b1.getNenner());
    }

    @Test
    @DisplayName("Addition zweier Brüche")
    void testAddiere() {
        Bruch b1 = new Bruch(1, 3);
        Bruch b2 = new Bruch(1, 6);
        b1.addiere(b2);
        assertEquals(1, b1.getZaehler());
        assertEquals(2, b1.getNenner());
    }

    @Test
    @DisplayName("toString Methode")
    void testToString() {
        Bruch b = new Bruch(3, 4);
        assertEquals("3/4", b.toString());
    }

    @Test
    @DisplayName("equals Methode")
    void testEquals() {
        Bruch b1 = new Bruch(2, 4);
        Bruch b2 = new Bruch(1, 2);
        assertEquals(b1, b2);
    }

    @Test
    @DisplayName("hashCode Konsistenz")
    void testHashCode() {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(1, 2);
        assertEquals(b1.hashCode(), b2.hashCode());
    }
}
