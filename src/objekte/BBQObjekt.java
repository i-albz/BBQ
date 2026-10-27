package objekte;

/**
 * Gemeinsame Mutterklasse für alle Objekte im BBQ-Projekt.
 * Sie verwaltet die ID, die jede Unterklasse benötigt.
 */
public class BBQObjekt {

    // protected: Auch Unterklassen dürfen auf die ID zugreifen.
    protected int id;

    /** Erstellt ein Objekt, dessen ID zunächst den Standardwert 0 hat. */
    public BBQObjekt() {
    }

    /** Erstellt ein Objekt mit einer vorgegebenen ID. */
    public BBQObjekt(int id) {
        this.id = id; // Speichert die übergebene ID im aktuellen Objekt.
    }

    /** Gibt die ID zurück. */
    public int getId() {
        return id;
    }

    /** Ändert die ID. */
    public void setId(int id) {
        this.id = id;
    }
}
