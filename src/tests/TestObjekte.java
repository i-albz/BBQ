package tests;

import objekte.Fach;
import objekte.Spezialisierung;

public class TestObjekte {

	public static void main(String[] args) {

//Fach 1
		Fach fach1;
		fach1 = new Fach();
		fach1.setId(1);
		;
		fach1.setBezeichnung("IT");
		IO.println(fach1);

// Fach 1 Spezial. 1		
		Spezialisierung spezi1 = new Spezialisierung();
		spezi1.setId(1);
		spezi1.setBezeichnung("AE");
		spezi1.setFach(fach1);

//		ArrayList<Spezialisierung> liste = fach1.getSpezialisierungen();
		String msg = fach1.addSpezialisierung(spezi1);

		if (msg != null)
			IO.print(msg);

		IO.println(spezi1);

// Fach 1 Spezial. 2	
		Spezialisierung spezi2 = new Spezialisierung(2, "SI", fach1);
		IO.println(spezi2);

	}

}
