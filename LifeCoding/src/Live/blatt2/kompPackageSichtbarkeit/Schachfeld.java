package Live.blatt2.kompPackageSichtbarkeit;


import Live.blatt2.FarbEnum;
import Live.blatt2.Schachfigur;

class Schachfeld {
	FarbEnum farbe;
	Schachfigur figur;
	String id;



	// Konstruktor angepasst
	public Schachfeld(String id, FarbEnum farbe, Schachfigur figur) {
		setId(id);
		setFarbe(farbe);

	}


	// Eine ID darf von aussen nicht veraendert werden
	private void setId (String id) {
		//wenn der Sting null ist
		if(id==null) {
			throw new RuntimeException("Ungültige ID");
		}
		// Wenn der erste Buchstabde der Id nicht zwischen A und H liegt, so wird eine Exeption geworfen
		if ((id.charAt(0) > (char)72) || (id.charAt(0) < (char) 65)) {
			throw new RuntimeException ("Ungueltige ID");
		}
		if(id.length()!=2) {
			throw new RuntimeException ("Ungueltige ID");
		}
		//wenn die zweite Stelle nicht Zahl zwischen 1-8 ist
		if(id.charAt(1) > (char)56 ||id.charAt(1) < (char)49) {
			throw new RuntimeException ("Ungueltige ID");
		}
		this.id = id; 

	}

	public String getId() {
		return this.id;
	}

	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
	}

	public FarbEnum getFarbe() {
		return this.farbe;
	}


	public void setFigur(Schachfigur figur) {
		this.figur = figur;
	}
	public Schachfigur getFigur() {
		return figur;
	}

	@Override
	public String toString() {

		return "Farbe: " + this.getFarbe().name() +"\nID: " + this.getId() + "\nFigurbelegung: " + this.getFigur();
	}



}