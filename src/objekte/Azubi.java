package objekte;

public class Azubi {

	private int id;
	private String name;
	private String vorname;
	private int spezialisierung_id;
	private int gruppe_id;
	
	public Azubi() {
		super();
	}
	
	public Azubi(int id, String name, String vorname, int spezialisierung_id, int gruppe_id) {
		super();
		this.id = id;
		this.name = name;
		this.vorname = vorname;
		this.spezialisierung_id = spezialisierung_id;
		this.gruppe_id = gruppe_id;
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

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getSpezialisierung_id() {
		return spezialisierung_id;
	}

	public void setSpezialisierung_id(int spezialisierung_id) {
		this.spezialisierung_id = spezialisierung_id;
	}

	public int getGruppe_id() {
		return gruppe_id;
	}

	public void setGruppe_id(int gruppe_id) {
		this.gruppe_id = gruppe_id;
	}

	@Override
    public String toString() {
        String str = name + vorname + "\n";
        str += "Gruppe " + gruppe_id + "\n";
        str += "Spezialisierung" + spezialisierung_id;
        return str;
    }
	
}
