/**
 * @author IhabAlbazweer
 */
package objekte;

import java.util.ArrayList;

public class Spezialisierung {

	// ID und Bezeichnung der Spezialisierung.
	private int id;
	private String bezeichnung;
	private Fach fach; // Eine Spezialisierung gehört zu einem Fach

	// 1:n-Beziehung: Einer Spezialisierung koennen mehrere Module zugeordnet sein.
	private ArrayList<Modul> module;

	public Spezialisierung() {

	}

	/**
	 * Konstruiert eine Instanz der Klasse. nitialisiert die Felder der Klasse
	 * 
	 * @param id
	 * @param bezeichnung
	 * @param fach_id
	 */
	// Der Konstruktor erhaelt ein Fach-Objekt anstelle einer fach_id-Zahl.
	public Spezialisierung(int id, String bezeichnung, Fach fach) {
		super();
		// Werte und Zugehoerigkeit zum Fach im Objekt speichern.
		this.id = id;
		this.bezeichnung = bezeichnung;
		this.fach = fach;
	}

	public String addModul(Modul m) {

		// Modulliste bei Bedarf erzeugen.
		if (module == null)
			module = new ArrayList<Modul>();

		// Doppelte Eintragung desselben Modul-Objekts verhindern.
		if (module.contains(m)) {
			return "Das Objekt ist bereits in der Liste";
		}

		// Hinweis: m.setSpezialisierung(this) wird hier NICHT automatisch aufgerufen.
		module.add(m);
		// null signalisiert: Hinzufuegen war erfolgreich.
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

	// Direkter Zugriff auf das zugeordnete Fach als Objekt.
	public Fach getFach() {
		return fach;
	}

	public void setFach(Fach fach) {
		this.fach = fach;
	}

	// Ausgabe der Spezialisierung mit dem Namen des verknuepften Fachs.
	@Override
	public String toString() {
		// Fehlt das Fach, wuerde fach.getBezeichnung() eine NullPointerException
		// ausloesen.
		return bezeichnung + " id " + id + " fach " + fach.getBezeichnung();
	}

}
