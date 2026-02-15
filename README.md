# AppClass - Bruch-Rechner

Eine Java-Anwendung zur Arbeit mit mathematischen Brüchen (Fractions). Das Projekt demonstriert objektorientierte Programmierung mit Java 21 und umfasst vollständige Unit Tests.

## Features

- **Bruchverwaltung**: Erzeugung und Manipulierung von mathematischen Brüchen
- **Automatisches Kürzen**: Alle Brüche werden automatisch in ihre gekürzte Form gebracht
- **Arithmetische Operationen**:
  - Multiplikation von Brüchen
  - Addition von Brüchen
  - Erweiterung von Brüchen
- **Robust**: Fehlerbehandlung für ungültige Eingaben
- **Gut getestet**: Umfangreiche Unit Tests mit JUnit 5

## Anforderungen

- **Java**: 21 oder höher
- **Maven**: 3.6.0 oder höher

## Installation

```bash
git clone <repository-url>
cd AppClass
```

## Verwendung

### Projekt bauen

```bash
mvn clean package
```

### Tests ausführen

```bash
mvn test
```

### Anwendung starten

**Direkter Start aus JAR-Datei (empfohlen):**

```bash
java -jar target/AppClass-1.0-SNAPSHOT.jar
```

Oder mit Classpath:

```bash
java -cp target/AppClass-1.0-SNAPSHOT.jar org.example.App
```

Oder mit Maven:

```bash
mvn exec:java -Dexec.mainClass="org.example.App"
```

## Beispiel-Code

```java
// Bruch erstellen (wird automatisch gekürzt)
Bruch b1 = new Bruch(6, 27);  // Wird zu 2/9
System.out.println(b1);       // Ausgabe: 2/9

// Bruch mit nur Zähler
Bruch b2 = new Bruch(5);      // 5/1

// Multiplikation
Bruch b3 = new Bruch(2, 3);
Bruch b4 = new Bruch(3, 4);
b3.multipliziere(b4);         // 2/3 * 3/4 = 1/2

// Addition
Bruch b5 = new Bruch(1, 3);
Bruch b6 = new Bruch(1, 6);
b5.addiere(b6);               // 1/3 + 1/6 = 1/2

// Erweiterung
Bruch b7 = new Bruch(1, 2);
b7.erweitern(4);              // Wird zu 4/8
```

## Projektstruktur

```
AppClass/
├── pom.xml                           # Maven-Konfiguration
├── README.md                         # Diese Datei
├── .gitignore                        # Git-Ignores
└── src/
    ├── main/java/org/example/
    │   ├── App.java                  # Hauptklasse mit Beispielen
    │   └── Bruch.java                # Bruch-Klasse
    └── test/java/org/example/
        └── AppTest.java              # Unit Tests
```

## Klassen

### Bruch

Die Hauptklasse zur Verwaltung mathematischer Brüche.

#### Konstruktoren

- `Bruch(int zaehler, int nenner)` - Erzeugt einen Bruch mit automatischem Kürzen
- `Bruch()` - Standardkonstruktor (1/2)
- `Bruch(int zaehler)` - Erzeugt einen Bruch der Form zaehler/1

#### Methoden

- `int getZaehler()` - Gibt den Zähler zurück
- `int getNenner()` - Gibt den Nenner zurück
- `void ausgeben()` - Gibt den Bruch in Konsole aus
- `void erweitern(int faktor)` - Erweitert den Bruch
- `void multipliziere(Bruch other)` - Multipliziert zwei Brüche
- `void addiere(Bruch other)` - Addiert zwei Brüche
- `String toString()` - Gibt Bruch als String zurück

## Verbesserungen gegenüber der ursprünglichen Version

- ✅ Upgrade auf **Java 21**
- ✅ Migration von **JUnit 4 zu JUnit 5** (Jupiter)
- ✅ **Getter-Methoden** statt direkte Field-Zugriffe
- ✅ **Bessere Fehlerbehandlung** mit Exceptions
- ✅ **Dokumentation** mit Javadoc-Kommentaren
- ✅ **Equals und HashCode** implementiert
- ✅ **Addition** als weitere arithmetische Operation
- ✅ **Umfangreiche Unit Tests** (11 Testfälle)
- ✅ **Minimierte pom.xml** mit essentiellen Dependencies
- ✅ **Aussagekräftige Beispiele** in der App.java
- ✅ **Executable JAR** - direkt ausführbar mit `java -jar`
- ✅ **Maven-JAR-Plugin** - Manifest mit Main-Class konfiguriert

## Lizenz

MIT-Lizenz

## Autor

Entwickelt mit Java 21
