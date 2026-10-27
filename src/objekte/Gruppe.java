package objekte;

import java.util.ArrayList;

public class Gruppe extends BBQObjekt {

	private String name;

	private ArrayList<Azubi> teilnehmer;

	/**
	 * 
	 */
	public Gruppe() {

	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Gruppe(int id, String name) {

		super(id);
		this.name = name;
	}

	/**
	 * 
	 * @param tn instanz der Klasse Azubi, d.h. ein Azubi,<br>
	 *           der in die Gruppe aufgenommen werden soll
	 * @return eine Meldung, wenn tn bereits zu der Gruppe gehört<br>
	 *         sonst null
	 */
	public String addTeilnehmer(Azubi tn) {

		if (teilnehmer == null)
			teilnehmer = new ArrayList<Azubi>();

		if (teilnehmer.contains(tn)) {
			return "Das Objekt ist bereits in der Liste";
		}

		tn.setGruppe(this);
		teilnehmer.add(tn);
		return null;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " id " + getId();
	}

}