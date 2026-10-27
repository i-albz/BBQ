/**
 * @author IhabAlbazweer
 */
package objekte;

public class Modul {

	// Identifikationsnummer und Bezeichnung des Moduls.
	private int id;
	private String bezeichnung;
	// n:1-Beziehung: Jedes Modul verweist auf eine Spezialisierung.
	private Spezialisierung spezialisierung;

	// Standardkonstruktor, z. B. fuer spaetere Belegung ueber Setter.
	public Modul() {
		super();
	}

	public Modul(int id, String bezeichnung, Spezialisierung spezialisierung) {
		super();
		// Eigenschaften und zugeordnete Spezialisierung speichern.
		this.id = id;
		this.bezeichnung = bezeichnung;
		this.spezialisierung = spezialisierung;
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

	// Der Getter gibt das verknuepfte Objekt statt der Fremdschluessel-ID zurueck.
	public Spezialisierung getSpezialisierung() {
		return spezialisierung;
	}

	// Aendert den Objektverweis; die Liste in Spezialisierung wird nicht angepasst.
	public void setSpezialisierung(Spezialisierung spezialisierung) {
		this.spezialisierung = spezialisierung;
	}

	// Fuer die Anzeige auch die Bezeichnung der Spezialisierung verwenden.
	@Override
	public String toString() {
		// Achtung: Ohne gesetzte Spezialisierung fuehrt der Aufruf zu einer
		// NullPointerException.
		return bezeichnung + " id " + id + " spezialisierung " + spezialisierung.getBezeichnung();
	}

}
