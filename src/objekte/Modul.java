package objekte;

public class Modul extends BBQObjekt {

	private String bezeichnung;
	private Spezialisierung spezialisierung;

	public Modul() {
		super();
	}

	public Modul(int id, String bezeichnung) {
		super(id);
		this.bezeichnung = bezeichnung;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Spezialisierung getSpezialisierung() {
		return spezialisierung;
	}

	public void setSpezialisierung(Spezialisierung spezialisierung) {
		this.spezialisierung = spezialisierung;
	}

	@Override
	public String toString() {
		return Fach.EOF + bezeichnung + " id " + getId() + Fach.EOF;
	}

}