package objekte;

import java.util.ArrayList;

/**
 * Repräsentiert eine Spezialisierung innerhalb eines Fachs.
 * Sie kann mehrere Module und Azubis enthalten und erbt ihre ID von BBQObjekt.
 */
public class Spezialisierung extends BBQObjekt {

    private String bezeichnung; // Name der Spezialisierung.
    private Fach fach; // Fach, zu dem diese Spezialisierung gehört.
    private ArrayList<Modul> module; // Alle zugehörigen Module.
    private ArrayList<Azubi> azubis; // Alle zugeordneten Azubis.

    /** Standardkonstruktor ohne direkte Belegung der Felder. */
    public Spezialisierung() {
    }

    /** Erstellt eine Spezialisierung mit ID und Bezeichnung. */
    public Spezialisierung(int id, String bezeichnung) {
        super(id); // Die Mutterklasse übernimmt die ID.
        this.bezeichnung = bezeichnung;
    }

    /**
     * Fügt ein Modul zur Spezialisierung hinzu.
     * @param m das hinzuzufügende Modul
     * @return Meldung bei doppeltem Eintrag, sonst null
     */
    public String addModul(Modul m) {
        // Modulliste bei der ersten Verwendung erstellen.
        if (module == null)
            module = new ArrayList<Modul>();

        if (module.contains(m)) { // Doppelte Aufnahme derselben Instanz verhindern.
            return "Das Objekt ist bereits in der Liste";
        }

        m.setSpezialisierung(this); // Rückverweis vom Modul auf diese Spezialisierung.
        module.add(m); // Modul zur Liste hinzufügen.
        return null;
    }

    /**
     * Fügt einen Azubi zur Spezialisierung hinzu.
     * @param a der hinzuzufügende Azubi
     * @return Meldung bei doppeltem Eintrag, sonst null
     */
    public String addZubi(Azubi a) {
        // Azubiliste bei der ersten Verwendung erstellen.
        if (azubis == null)
            azubis = new ArrayList<Azubi>();

        if (azubis.contains(a)) { // Dieselbe Instanz nicht doppelt speichern.
            return "Das Objekt ist bereits in der Liste";
        }

        a.setSpezialisierung(this); // Rückverweis vom Azubi auf diese Spezialisierung.
        azubis.add(a); // Azubi zur Liste hinzufügen.
        return null;
    }

    /** Gibt den Namen der Spezialisierung zurück. */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /** Setzt den Namen der Spezialisierung. */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /** Gibt das übergeordnete Fach zurück (ggf. null). */
    public Fach getFach() {
        return fach;
    }

    /** Verknüpft die Spezialisierung mit einem Fach. */
    public void setFach(Fach fach) {
        this.fach = fach;
    }

    /** Gibt diese Spezialisierung und die in ihrer Modulliste enthaltenen Module aus. */
    @Override
    public String toString() {
        String str = Fach.EOF + bezeichnung + " id " + getId() + Fach.EOF;
        // Wenn keine Module angelegt sind, wird nur die Spezialisierung angezeigt.
        if (module != null)
            str += module.toString();
        return str;
    }
}
