package tests;

import objekte.Azubi;
import objekte.Fach;
import objekte.Gruppe;
import objekte.Spezialisierung;

/** Testet die Erstellung einzelner Objekte, Setter und Konsolenausgaben. */
public class TestObjekte {

    /** Startpunkt zum Testen der einzelnen Klassen. */
    public static void main(String[] args) {

        // Fach zunächst ohne Werte erstellen und anschließend über Setter belegen.
        Fach fach1;
        fach1 = new Fach();
        fach1.setId(1);
        ; // Überflüssiges Semikolon aus der Vorlage: hat keine Wirkung.
        fach1.setBezeichnung("IT");
        System.out.println(fach1); // Fach ohne verknüpfte Spezialisierungen ausgeben.

        // Erste Spezialisierung erstellen und mit dem Fach verknüpfen.
        Spezialisierung spezi1 = new Spezialisierung(1, "AE");
        spezi1.setFach(fach1);

        // Fügt spezi1 zur Liste des Fachs hinzu; msg ist bei Erfolg null.
        String msg = fach1.addSpezialisierung(spezi1);
        if (msg != null)
            System.out.print(msg); // Meldung nur im Fehlerfall ausgeben.

        System.out.println(spezi1); // Noch ohne Module.

        // Zweite Spezialisierung nur erzeugen und ausgeben (nicht zum Fach hinzufügen).
        Spezialisierung spezi2 = new Spezialisierung(2, "SI");
        System.out.println(spezi2);

        // Ein unabhängiges Gruppenobjekt und ein Azubi-Objekt erstellen.
        Gruppe gruppe = new Gruppe(12, "U30");
        Azubi az = new Azubi(1, "Schmidt", "Max");

        // Die Objekte sind hier noch nicht miteinander verknüpft.
        System.out.print(az); // Ausgabe über die überschriebenen toString()-Methoden.
        System.out.println(gruppe);
    }
}
