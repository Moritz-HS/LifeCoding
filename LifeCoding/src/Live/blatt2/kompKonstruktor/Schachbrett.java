package Live.blatt2.kompKonstruktor;

import Live.blatt2.FarbEnum;


public class Schachbrett {

	private Schachfeld [][] alleFelder = new Schachfeld[8][8];
	
	
	public Schachbrett() {
		setAlleFelder();
	}
	
	public void setAlleFelder() {
		

		for(int zeile = 0; zeile < 8; zeile ++ ) {
			// Setzt Buchstabe fuer das Spielfeld
			char buchstabe = (char)(72-zeile);
			for(int spalte = 0; spalte < 8; spalte++) {
					int zahl = spalte +1; 
					String id = buchstabe + "" + zahl;
					
					FarbEnum farbe = FarbEnum.SCHWARZ; 
					if((zeile+spalte) % 2 == 0) {
						farbe = FarbEnum.WEISS;
					}	
				// Es wird jedes Mal ein neues Schachfeld erzeugt, die Spielfigur wird hierbei nicht genau definiert. 
				// Die Spielfiguren koennen manuell uber setSpielfigur dem jeweiligen Feld hinzugefuegt werden
				alleFelder[zeile][spalte] = new Schachfeld(id, farbe, null, this);
	
				}
	
		}
	
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
	
	
	
}
