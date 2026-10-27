package objekte;

import java.util.ArrayList;

public class Spezialisierung {

	private int id;
	private String bezeichnung;
	private Fach fach; // Eine Spezialisierung gehört zu einem Fach
	
	private ArrayList<Modul> module;
	private ArrayList<Azubi> azubis;

	public Spezialisierung() {

	}

	/**
	 * Konstruiert eine Instanz der Klasse. nitialisiert die Felder der Klasse
	 * 
	 * @param id
	 * @param bezeichnung
	 */
	public Spezialisierung(int id, String bezeichnung) {
		super();
		this.id = id;
		this.bezeichnung = bezeichnung;
	}
	
	/**
	 * Fügt ein Modul in die Modulliste hinzu
	 * @param m Modul
	 * @return Message, wenn das Modul bereits hinzugefügt ist, somst null
	 */
	public String addModul(Modul m) {

		if (module == null)
			module = new ArrayList<Modul>();

		if (module.contains(m)) {
			return "Das Objekt ist bereits in der Liste";
		}

		m.setSpezialisierung(this);
		module.add(m);
		return null;
	}
	
	/**
	 * Fügt einen Azubi in die Liste der Azubis hinzu
	 * @param azubi Azubi
	 * @return Message, wenn das Modul bereits hinzugefügt ist, somst null
	 */
	public String addZubi(Azubi a) {

		if (azubis == null)
			azubis = new ArrayList<Azubi>();

		if (azubis.contains(a)) {
			return "Das Objekt ist bereits in der Liste";
		}

		a.setSpezialisierung(this);
		azubis.add(a);
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
		String str = Fach.EOF + bezeichnung + " id " + id + Fach.EOF;
		str += module.toString();
		return str;
	}

}