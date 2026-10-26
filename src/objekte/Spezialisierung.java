package objekte;

public class Spezialisierung{

	private int id;
	private String bezeichnung;
	private int fach_id;
	
	public Spezialisierung() {
		
	}
	
	
	public Spezialisierung(int id, String bezeichnung, int fach_id) {
		super();
		this.id = id;
		this.bezeichnung = bezeichnung;
		this.fach_id = fach_id;
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


	public int getFach_id() {
		return fach_id;
	}


	public void setFach_id(int fach_id) {
		this.fach_id = fach_id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bezeichnung + " id: " + id + "Fach: " + fach_id;
	}
}
