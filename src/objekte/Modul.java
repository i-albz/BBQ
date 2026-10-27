package objekte;

/**
 * Repräsentiert ein Ausbildungsmodul, das einer Spezialisierung zugeordnet ist.
 * Die Modul-ID wird von BBQObjekt geerbt.
 */
public class Modul extends BBQObjekt {

    private String bezeichnung; // Name des Moduls.
    private Spezialisierung spezialisierung; // Zugehörige Spezialisierung.

    /** Standardkonstruktor: Die Eigenschaften können später gesetzt werden. */
    public Modul() {
        super(); // Ruft den parameterlosen Konstruktor der Mutterklasse auf.
    }

    /** Erstellt ein Modul mit einer ID und einer Bezeichnung. */
    public Modul(int id, String bezeichnung) {
        super(id); // Korrektur: ID muss an BBQObjekt übergeben werden.
        this.bezeichnung = bezeichnung;
    }

    /** Gibt die Modulbezeichnung zurück. */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /** Ändert die Modulbezeichnung. */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /** Gibt die zugeordnete Spezialisierung zurück (ggf. null). */
    public Spezialisierung getSpezialisierung() {
        return spezialisierung;
    }

    /** Verknüpft das Modul mit einer Spezialisierung. */
    public void setSpezialisierung(Spezialisierung spezialisierung) {
        this.spezialisierung = spezialisierung;
    }

    /** Gibt Bezeichnung und geerbte ID des Moduls als Text aus. */
    @Override
    public String toString() {
        // Fach.EOF fügt vor und nach dem Modul einen Zeilenumbruch ein.
        return Fach.EOF + bezeichnung + " id " + getId() + Fach.EOF;
    }
}
