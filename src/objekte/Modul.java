package objekte;

public class Modul {

	private int id;
	private String bezeichnung;
	private int spezialisierung_id;

    public Modul() {
        super();
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

	public int getSpezialisierung_id() {
		return spezialisierung_id;
	}

	public void setSpezialisierung_id(int spezialisierung_id) {
		this.spezialisierung_id = spezialisierung_id;
	}

	public Modul(int id, String bezeichnung, int spezialisierung_id) {
        super();
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.spezialisierung_id = spezialisierung_id;
    }

    
    
    @Override
    public String toString() {
        return bezeichnung + " id " + id + " spezialisierung " + spezialisierung_id;
    }
}