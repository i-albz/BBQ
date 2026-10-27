package objekte;

/**
 * Repräsentiert einen Auszubildenden im BBQ-Projekt.
 * Erbt die ID sowie deren Getter und Setter von BBQObjekt.
 */
public class Azubi extends BBQObjekt {

    private String name; // Nachname des Azubis.
    String vorname; // Vorname des Azubis (wie in der Vorlage paketweit sichtbar).
    private Spezialisierung spezialisierung; // Fachliche Zuordnung des Azubis.
    private Gruppe gruppe; // Gruppe, zu der der Azubi gehört.

    /** Standardkonstruktor: Die Felder können später gesetzt werden. */
    public Azubi() {
        super(); // Ruft den parameterlosen Konstruktor von BBQObjekt auf.
    }

    /** Erstellt einen Azubi mit ID, Nachnamen und Vornamen. */
    public Azubi(int id, String name, String vorname) {
        super(id); // Die Mutterklasse speichert die ID.
        this.name = name;
        this.vorname = vorname;
    }

    /** Gibt den Nachnamen zurück. */
    public String getName() {
        return name;
    }

    /** Setzt den Nachnamen. */
    public void setName(String name) {
        this.name = name;
    }

    /** Gibt den Vornamen zurück. */
    public String getVorname() {
        return vorname;
    }

    /** Setzt den Vornamen. */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /** Gibt die zugeordnete Spezialisierung zurück (ggf. null). */
    public Spezialisierung getSpezialisierung() {
        return spezialisierung;
    }

    /** Verknüpft den Azubi mit einer Spezialisierung. */
    public void setSpezialisierung(Spezialisierung spezialisierung) {
        this.spezialisierung = spezialisierung;
    }

    /** Gibt die zugeordnete Gruppe zurück (ggf. null). */
    public Gruppe getGruppe() {
        return gruppe;
    }

    /** Verknüpft den Azubi mit einer Gruppe. */
    public void setGruppe(Gruppe gruppe) {
        this.gruppe = gruppe;
    }

    /** Gibt den Azubi mit Nachname, Vorname und ID als Text aus. */
    @Override
    public String toString() {
        // getId() ist von der Mutterklasse BBQObjekt geerbt.
        return name + " " + vorname + " id " + getId() + "\n";
    }
}
