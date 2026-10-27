package tests;

import objekte.Azubi;
import objekte.Fach;
import objekte.Gruppe;
import objekte.Spezialisierung;

public class TestObjekte {

	public static void main(String[] args) {

//Fach 1
		Fach fach1;
		fach1 = new Fach();
		fach1.setId(1);
		;
		fach1.setBezeichnung("IT");
		System.out.println(fach1);

// Fach 1 Spezial. 1		
		Spezialisierung spezi1 = new Spezialisierung(1, "AE");
		spezi1.setFach(fach1);

//		ArrayList<Spezialisierung> liste = fach1.getSpezialisierungen();
		String msg = fach1.addSpezialisierung(spezi1);

		if (msg != null)
			System.out.print(msg);

		System.out.println(spezi1);

// Fach 1 Spezial. 2	
		Spezialisierung spezi2 = new Spezialisierung(2, "SI");
		System.out.println(spezi2);
		
		Gruppe gruppe = new Gruppe(12, "U30");
		
		Azubi az = new Azubi(1, "Schmidt", "Max");
		
		IO.print(az);
		IO.println(gruppe);

	}

}