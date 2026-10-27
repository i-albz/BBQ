package objekte;

import java.util.ArrayList;

public class Gruppe {

	private int id;
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

		this.id = id;
		this.name = name;
	}
	
	/**
	 * 
	 * @param tn
	 * @return
	 */
	public String addTeilnehmer(Azubi tn) {

		if (teilnehmer == null)
			teilnehmer = new ArrayList<Azubi>();

		if (teilnehmer.contains(tn)) {
			return "Das Objekt ist bereits in der Liste";
		}

		teilnehmer.add(tn);
		return null;
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

	@Override
	public String toString() {
		return name + " id " + id;
	}

}
