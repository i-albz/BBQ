package tests;


import objekte.Azubi;
import objekte.Fach;
import objekte.Gruppe;
import objekte.Modul;
import objekte.Spezialisierung;

/**
 * Schreiben Sie ein Test-Programm, mit dem Instanzen erzeugt werden:
 * • für ein Fach
 * • für dieses Fach zwei Spezialisierungen
 * • für jede dieser Spezialisierung
 *   • drei Module
 *   • fünf Azubis, die in einer Gruppe sind.
 */
public class Aufgabe4 {

public static void main(String[] args) {

    Fach f = createFach(1);

    Spezialisierung sp;
    f.addSpezialisierung(sp = createSpezialisierung(1, "Erste Spezialisierung", f));

    sp.addModul(createModul(1, "Modul 1.1", sp));
    sp.addModul(createModul(2, "Modul 1.2", sp));
    sp.addModul(createModul(3, "Modul 1.3", sp));

    Gruppe gr = new Gruppe(10, "Gruppe 1");
    createAzibiFor(gr, 5, sp);

    f.addSpezialisierung(sp = createSpezialisierung(2, "Zweite Spezialisierung", f));

}

// createAzibiFor gr:Gruppe undForSp: Spezialisierung gesamt: int
private static void createAzibiFor(Gruppe gr, int anzahl, Spezialisierung sp) {
    for (int i = 1; i < anzahl; i++) {
        gr.addTeilnehmer(new Azubi(i, "Name" + i, "Vorname" + 1, sp, gr));
    }
}

private static Modul createModul(int id, String name, Spezialisierung sp) {
    return new Modul(id, name, sp);
}

private static Spezialisierung createSpezialisierung(int id, String name, Fach f) {
    return new Spezialisierung(id, name, f);
}


    // Ein Fach
    private static Fach createFach(int id) {
        return new Fach(id, "FACH");
    }
}
