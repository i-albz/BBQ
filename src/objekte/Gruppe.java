package objekte;

import java.util.ArrayList;

/**
 * Repräsentiert eine Ausbildungsgruppe mit mehreren Azubis.
 * Die Gruppen-ID wird von BBQObjekt geerbt.
 */
public class Gruppe extends BBQObjekt {

    private String name; // Gruppenname, z. B. Gruppe 1.
    private ArrayList<Azubi> teilnehmer; // Liste aller Azubis in dieser Gruppe.

    /** Standardkonstruktor für eine zunächst leere Gruppe. */
    public Gruppe() {
    }

    /** Erstellt eine Gruppe mit ID und Namen. */
    public Gruppe(int id, String name) {
        super(id); // Setzt die geerbte ID.
        this.name = name;
    }

    /**
     * Nimmt einen Azubi in die Gruppe auf.
     * @param tn aufzunehmender Azubi
     * @return Meldung, wenn derselbe Azubi bereits enthalten ist, sonst null
     */
    public String addTeilnehmer(Azubi tn) {
        // Die Liste wird erst beim ersten Teilnehmer erstellt.
        if (teilnehmer == null)
            teilnehmer = new ArrayList<Azubi>();

        // Prüft, ob genau dieses Azubi-Objekt bereits aufgenommen wurde.
        if (teilnehmer.contains(tn)) {
            return "Das Objekt ist bereits in der Liste";
        }

        tn.setGruppe(this); // Der Azubi erhält einen Verweis auf diese Gruppe.
        teilnehmer.add(tn); // Die Gruppe speichert den Azubi.
        return null; // Erfolgreiche Aufnahme.
    }

    /** Gibt den Namen der Gruppe zurück. */
    public String getName() {
        return name;
    }

    /** Ändert den Namen der Gruppe. */
    public void setName(String name) {
        this.name = name;
    }

    /** Gibt Name und geerbte ID der Gruppe zurück. */
    @Override
    public String toString() {
        return name + " id " + getId();
    }
}
