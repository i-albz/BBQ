/**
 * @author ValentinaTikko
 */
package objekte;

import java.util.ArrayList;

/**
 * Entspricht der DB-Entität Fach
 */
public class Fach extends Object {

	private int id;
	private String bezeichnung;
	// zu einem Fach gehören mehrere Spezialisierungen
	// A lot of Spezialisierung belong to Fach
	// mehrere = []; A lot of = []
	private ArrayList<Spezialisierung> spezialisierungen;

	/**
	 * Standartkonstruktor
	 */
	public Fach() {

	}

	/**
	 * Konstruiert eine Instanz der Klasse und initielisiert alle Felder
	 * 
	 * @param id          entspricht dem PK eines Datensatzes
	 * @param bezeichnung Bezeichnung des Faches
	 */
	public Fach(int id, String bezeichnung) {
		this.id = id;
		this.bezeichnung = bezeichnung;
	}

	/**
	 * Fügt eine Spezialisierung zu der Liste Вносит объект Spezialisierung в
	 * список. <br>
	 * Перед внесением проверяет, <br>
	 * 1. существует ли ArrayList spezialisierungen. Если нет инициализирует.<br>
	 * 2. Находится ли объект в ArrayList spezialisierungen, если да, return
	 * message.
	 * 
	 * @param sp
	 */
	public String addSpezialisierung(Spezialisierung sp) {

		if (spezialisierungen == null)
			spezialisierungen = new ArrayList<Spezialisierung>();

		if (spezialisierungen.contains(sp)) {
			return "Das Objekt ist bereits in der Liste";
		}

		spezialisierungen.add(sp);
		return null;
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
