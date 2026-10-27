package objekte;

import java.util.ArrayList;

public class Spezialisierung {

	private int id;
	private String bezeichnung;
	private Fach fach; // Eine Spezialisierung gehört zu einem Fach
	
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
	public Spezialisierung(int id, String bezeichnung, Fach fach) {
		super();
		this.id = id;
		this.bezeichnung = bezeichnung;
		this.fach = fach;
	}
	
	public String addModul(Modul m) {

		if (module == null)
			module = new ArrayList<Modul>();

		if (module.contains(m)) {
			return "Das Objekt ist bereits in der Liste";
		}

		module.add(m);
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

	public Fach getFach() {
		return fach;
	}

	public void setFach(Fach fach) {
		this.fach = fach;
	}

	@Override
	public String toString() {
		return bezeichnung + " id " + id + " fach " + fach.getBezeichnung();
	}

}
