/**
 * @author IhabAlbazweer
 */
package objekte;

import java.util.ArrayList;

public class Gruppe {

	// Gruppe wird ueber id identifiziert und besitzt einen Namen.
	private int id;
	private String name;

	// 1:n-Beziehung: Eine Gruppe kann mehrere Azubis enthalten.
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

		// Eigenschaften der neu angelegten Gruppe uebernehmen.
		this.id = id;
		this.name = name;
	}

	/**
	 * 
	 * @param tn
	 * @return
	 */
	public String addTeilnehmer(Azubi tn) {

		// Teilnehmerliste erst anlegen, wenn sie erstmals benoetigt wird.
		if (teilnehmer == null)
			teilnehmer = new ArrayList<Azubi>();

		// Bereits enthaltene Objektinstanz nicht erneut einfuegen.
		if (teilnehmer.contains(tn)) {
			return "Das Objekt ist bereits in der Liste";
		}

		// Hinweis: addTeilnehmer() setzt NICHT automatisch tn.setGruppe(this).
		teilnehmer.add(tn);
		// Rueckgabe null bedeutet: Teilnehmer erfolgreich aufgenommen.
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

	// Ausgabe von Gruppenname und ID fuer Tests und Protokolle.
	@Override
	public String toString() {
		return name + " id " + id;
	}

}
