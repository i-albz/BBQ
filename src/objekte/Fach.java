package objekte;

import java.util.ArrayList;

/**
 * Repräsentiert ein Fach, z. B. IT. Es ist der Root-Knoten des Datenmodells.
 * Ein Fach enthält mehrere Spezialisierungen und erbt die ID von BBQObjekt.
 * @author ValentinaTikko (ursprüngliche Klassenvorlage)
 */
public class Fach extends BBQObjekt {

    public static final String EOF = "\n"; // Gemeinsames Zeichen für einen Zeilenumbruch.

    private String bezeichnung; // Name des Fachs.
    private ArrayList<Spezialisierung> spezialisierungen; // Zugehörige Spezialisierungen.

    /** Standardkonstruktor: Felder werden zunächst nicht ausdrücklich gesetzt. */
    public Fach() {
    }

    /** Erstellt ein Fach mit ID und Bezeichnung. */
    public Fach(int id, String bezeichnung) {
        super(id); // Übergibt die ID an die Mutterklasse.
        this.bezeichnung = bezeichnung;
    }

    /**
     * Fügt eine Spezialisierung zum Fach hinzu.
     * @param sp Spezialisierung, die aufgenommen werden soll
     * @return Fehlermeldung bei doppeltem Eintrag, sonst null
     */
    public String addSpezialisierung(Spezialisierung sp) {
        // Die Liste wird erst bei der ersten Verwendung angelegt.
        if (spezialisierungen == null)
            spezialisierungen = new ArrayList<Spezialisierung>();

        // Dieselbe Objektinstanz soll nicht zweimal in der Liste stehen.
        if (spezialisierungen.contains(sp)) {
            return "Das Objekt ist bereits in der Liste";
        }

        sp.setFach(this); // Setzt den Rückverweis auf dieses Fach.
        spezialisierungen.add(sp); // Speichert die Spezialisierung in der Liste.
        return null; // null bedeutet hier: erfolgreich hinzugefügt.
    }

    /** Gibt die Bezeichnung des Fachs zurück. */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /** Ändert die Bezeichnung des Fachs. */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Liefert den Text des Fachs samt Spezialisierungen.
     * Deren toString()-Methoden liefern zusätzlich die jeweiligen Module.
     */
    @Override
    public String toString() {
        String str = "Fach " + bezeichnung + " id " + getId() + EOF;
        // Verhindert einen Fehler, solange noch keine Spezialisierung existiert.
        if (spezialisierungen != null)
            str += spezialisierungen.toString();
        return str;
    }
}
