package tests;

import objekte.Fach;
import objekte.Spezialisierung;

public class TestObjekte {

		// Einfache Testdaten anlegen und Beziehungen zwischen Objekten ausprobieren.
	public static void main(String[] args) {

//Fach 1
		// Standardkonstruktor und Setter statt des Konstruktors mit Parametern nutzen.
		Fach fach1;
		fach1 = new Fach();
		fach1.setId(1);
		// Das alleinstehende Semikolon ist eine leere Anweisung ohne Wirkung.
		;
		fach1.setBezeichnung("IT");
		// toString() bestimmt die Textdarstellung bei der Ausgabe.
		IO.println(fach1);

// Fach 1 Spezial. 1		
		// Erste Spezialisierung anlegen und mit fach1 verknuepfen.
		Spezialisierung spezi1 = new Spezialisierung();
		spezi1.setId(1);
		spezi1.setBezeichnung("AE");
		spezi1.setFach(fach1);

//		ArrayList<Spezialisierung> liste = fach1.getSpezialisierungen();
		// Rueckgabewert pruefen: Meldung bei Duplikat, sonst null.
		String msg = fach1.addSpezialisierung(spezi1);

		// Nur vorhandene Fehlermeldungen ausgeben.
		if (msg != null)
			IO.print(msg);

		IO.println(spezi1);

// Fach 1 Spezial. 2	
		// Zweite Spezialisierung direkt ueber den Konstruktor erzeugen.
		Spezialisierung spezi2 = new Spezialisierung(2, "SI", fach1);
		// Hinweis: spezi2 wird hier noch nicht mit fach1.addSpezialisierung() zur Liste hinzugefuegt.
		IO.println(spezi2);

	}

}
