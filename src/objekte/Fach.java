/**
 * @author IhabAlbazweer
 */
package objekte;

public class Fach extends Object {

    // package protected
    private int id;
    private String bezeichnung;
    
/**
 * Standartstruktur
 */
    public Fach() {

    }
/**
 * Konstruiert eine Instanz der Klasse und initialisiert alle Felder
 * @param id entspricht dem PK eines Datensatzes
 * @param bezeichnung Bezeichnung des Faches
 */
    public Fach(int id, String bezeichnung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@Override
    public String toString() {
        String str = "Fach " + bezeichnung + " id " + id;
        return str;
    }
}