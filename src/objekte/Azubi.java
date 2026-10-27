/**
 * @author IhabAlbazweer
 */
package objekte;

public class Azubi {

	// Eindeutige Kennung des Azubi-Datensatzes.
	private int id;
	private String name;
	String vorname;
	// Objektverweise bilden die Fremdschluessel auf Spezialisierung und Gruppe ab.
	private Spezialisierung spezialisierung;
	private Gruppe gruppe;

	// Leerer Konstruktor: Attribute werden spaeter ueber Setter gesetzt.
	public Azubi() {
		super();
	}

	public Azubi(int id, String name, String vorname, Spezialisierung spezialisierung, Gruppe gruppe) {

		super();
		// Die uebergebenen Werte im aktuellen Objekt speichern.
		this.id = id;
		this.name = name;
		this.vorname = vorname;
		this.spezialisierung = spezialisierung;
		this.gruppe = gruppe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	// Liefert die zugeordnete Spezialisierung als Objekt (nicht nur ihre ID).
	public Spezialisierung getSpezialisierung() {
		return spezialisierung;
	}

	public void setSpezialisierung(Spezialisierung spezialisierung) {
		this.spezialisierung = spezialisierung;
	}

	// Liefert die Gruppe, der dieser Azubi zugeordnet ist.
	public Gruppe getGruppe() {
		return gruppe;
	}

	public void setGruppe(Gruppe gruppe) {
		this.gruppe = gruppe;
	}

	// Textdarstellung mit Daten aus den verknuepften Objekten.
	@Override
	public String toString() {
		// Hinweis: Fehlen Gruppe oder Spezialisierung, kann getId()/getBezeichnung()
		// fehlschlagen.
		String str = name + vorname + "\n";
		str += "Gruppe " + gruppe.getId() + "\n";
		str += "Spezialisierung" + spezialisierung.getBezeichnung();
		return str;
	}

}
