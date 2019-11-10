package Live.blatt2.kompMemberKlasse;

import Live.blatt2.EnumFigurTyp;
import Live.blatt2.FarbEnum;
import Live.blatt2.Schachfigur;



public class Schachbrett {
	
	


	Schachfeld [][] alleFelder = new Schachfeld[8][8];


	public Schachbrett() {


		for(int zeile = 0; zeile < 8; zeile ++ ) {
			// Setzt Buchstabe fuer das Spielfeld
			char buchstabe = (char)(72-zeile);
			for(int spalte = 0; spalte < 8; spalte++) {
					// Zahl des Spielfelds
					int zahl = spalte +1; 
					String id = buchstabe + "" + zahl;
					// Farbe des Feldes
					FarbEnum farbe = FarbEnum.SCHWARZ; 
					// Simpler Modulo Algorithmus, um abwechselnd Schwarz und Weiss zu belegen, die Felder
					if((zeile+spalte) % 2 == 0) {
						farbe = FarbEnum.WEISS;
					}	
	
				// Es wird jedes Mal ein neues Schachfeld erzeugt, die Spielfigur wird hierbei nicht genau definiert. 
				// Die Spielfiguren koennen manuell uber setSpielfigur dem jeweiligen Feld hinzugefuegt werden
				alleFelder[zeile][spalte] = new Schachfeld(id, farbe, null);
	
				}
	
		}
	}

	public void setAlleFelder() {
	}

	public Schachfeld[][] getAlleFelder(){
		return alleFelder;
	}
	@Override
	public String toString() {
		StringBuilder sB = new StringBuilder();
		for(Schachfeld [] zeile : alleFelder) {
			for(Schachfeld feld : zeile) {
				sB.append( feld.toString());
			}
			sB.append("\n");
		}
		return sB.toString();
	}

	// Ruft Methode von unten auf
	public String getId (int zeile, int spalte) {
		return alleFelder[zeile][spalte].getId();
	}
	
	
	// Ruft Methode von unten auf
	public void setFigur (int zeile, int spalte , FarbEnum farbe,  EnumFigurTyp figur) {
		
		alleFelder[zeile][spalte].setFigur(farbe, figur);
	
	}
	
	public Schachfigur getFigur (int zeile, int spalte) {
		return alleFelder[zeile][spalte].getFigur();
	
	}
	

	 private class Schachfeld {
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

			
			public void setFigur(FarbEnum farbe, EnumFigurTyp figurTyp) {
				this.figur.setFarbe(farbe);
				this.figur.setFigurTyp(figurTyp);
			}
		
			public Schachfigur getFigur() {
				return figur;
			}

			@Override
			public String toString() {

				return this.getFarbe().name();
			}

		}

}
