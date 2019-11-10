package Live.blatt2.kompPackageSichtbarkeit;

import Live.blatt2.EnumFigurTyp;
import Live.blatt2.FarbEnum;
import Live.blatt2.Schachfigur;



public class Schachbrett {

	Schachfeld [][] alleFelder = new Schachfeld[8][8];
	Schachfeld schachfeld;
	
	public Schachbrett() {

	
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
				alleFelder[zeile][spalte] = new Schachfeld(id, farbe, null);
	
				}
	
		}
		Schachfigur fSchachfigur = new Schachfigur(FarbEnum.SCHWARZ, EnumFigurTyp.DAME);
		alleFelder[0][0].setFigur(fSchachfigur);
	}
	

	public Schachfeld[][] getAlleFelder(){
		return alleFelder;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sB = new StringBuilder();
		for(Schachfeld [] zeile : alleFelder) {
			for(Schachfeld feld : zeile) {
				sB.append(feld.getId() + "|");
			}
			sB.append("\n");
		}
		return sB.toString();
	}
	
	public Schachfeld getSchachfeld(String id) {
		if(id == null) {
			throw new RuntimeException("Die Id für das gesuchte feld muss gegeben werden.");
		}
		for(Schachfeld[] zeile: alleFelder) {
			for(Schachfeld feld: zeile) {
				if(id.equals(feld.getId())) {
					return feld;
				}
			}
		}
		return null;
		
	}
	
	public String brettToString() {
		StringBuilder sB = new StringBuilder("__1___2___3___4___5___6___7___8\n");
		for(int i = 0; i < 8; i++) {
			sB.append(alleFelder[i][0].getId().charAt(0) + "|");
		
			for(int j = 0; j<8; j++) {
				if(alleFelder[i][j].getFarbe() == FarbEnum.SCHWARZ) {
					sB.append("s");
					if(alleFelder[i][j].getFigur() !=null) {
						String figurTyp = "" + alleFelder[i][j].getFigur().getFigurTyp().name().charAt(0);
						sB.append(figurTyp);
						sB.append(Character.toLowerCase((alleFelder[i][j].getFigur().getFarbe().name().charAt(0))));
					}
					else{
						sB.append("   ");
					}
				}
				else if(alleFelder[i][j].getFarbe() == FarbEnum.WEISS) {
					sB.append("w");		
					if(alleFelder[i][j].getFigur() !=null) {
		
						String figurTyp = "" + alleFelder[i][j].getFigur().getFigurTyp().name().charAt(0);
						sB.append(figurTyp);
						sB.append(Character.toLowerCase((alleFelder[i][j].getFigur().getFarbe().name().charAt(0))) + " ");
					}
					else{
						sB.append("   ");
					}
				}
						
			}	
			sB.append("\n");
		}
		return sB.toString();
	}
	
}
