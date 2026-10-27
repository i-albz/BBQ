package tests;

import objekte.Azubi;
import objekte.Fach;
import objekte.Gruppe;
import objekte.Modul;
import objekte.Spezialisierung;

/**
 * Testet das BBQ-Datenmodell mit einem Fach, zwei Spezialisierungen,
 * drei Modulen und fünf Azubis je Spezialisierung.
 */
public class Aufgabe4 {

    /** Startpunkt des Testprogramms. */
    public static void main(String[] args) {

        // Ein Fach als Ausgangspunkt (Root-Knoten) erstellen.
        Fach f = createFach(1);

        // Erste Spezialisierung anlegen und dem Fach zuordnen.
        Spezialisierung sp;
        f.addSpezialisierung(sp = createSpezialisierung(1, "Erste Spezialisierung"));

        // Drei Module zur ersten Spezialisierung hinzufügen.
        sp.addModul(createModul(1, "Modul 1.1"));
        sp.addModul(createModul(2, "Modul 1.2"));
        sp.addModul(createModul(3, "Modul 1.3"));

        // Erste Gruppe erstellen und fünf Azubis zuordnen.
        Gruppe gr = new Gruppe(10, "Gruppe 1");
        Azubi az;
        for (int i = 1; i < 5 + 1; i++) {
            // Ein neues Azubi-Objekt entsteht pro Schleifendurchlauf.
            gr.addTeilnehmer(az = new Azubi(i, "Name" + i, "Vorname" + i));
            sp.addZubi(az); // Derselbe Azubi gehört außerdem zur Spezialisierung.
        }

        // Zweite Spezialisierung mit drei eigenen Modulen erstellen.
        f.addSpezialisierung(sp = createSpezialisierung(2, "Zweite Spezialisierung"));
        sp.addModul(createModul(4, "Modul 2.1"));
        sp.addModul(createModul(5, "Modul 2.2"));
        sp.addModul(createModul(6, "Modul 2.3"));

        // Zweite Gruppe und weitere fünf Azubis erstellen (IDs 6 bis 10).
        gr = new Gruppe(11, "Gruppe 2");
        for (int i = 6; i <= 10; i++) {
            gr.addTeilnehmer(az = new Azubi(i, "Name" + i, "Vorname" + i));
            sp.addZubi(az);
        }

        // Fach.toString() enthält auch die Spezialisierungen und deren Module.
        System.out.println(f);
    }

    /** Hilfsmethode: Erzeugt genau ein Modul und gibt es zurück. */
    private static Modul createModul(int id, String name) {
        return new Modul(id, name);
    }

    /** Hilfsmethode: Erzeugt eine Spezialisierung und gibt sie zurück. */
    private static Spezialisierung createSpezialisierung(int id, String name) {
        return new Spezialisierung(id, name);
    }

    /** Hilfsmethode: Erzeugt ein Fach mit der Bezeichnung FACH. */
    private static Fach createFach(int id) {
        return new Fach(id, "FACH");
    }
}
