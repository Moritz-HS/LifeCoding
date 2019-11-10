package Live.blatt2.kompKonstruktor;

import Live.blatt2.EnumFigurTyp;
import Live.blatt2.FarbEnum;

public class Schachfeld {
	FarbEnum farbe;
	Schachbrett brett;
	String id;
	EnumFigurTyp figur;
	




	public Schachfeld(String id, FarbEnum farbe, EnumFigurTyp figur, Schachbrett brett)throws RuntimeException {
	
			if(brett == null) {
				throw new RuntimeException("Wir brauchen ein Brett um ein Feld zu erzeugen!");
			}
			this.brett = brett;
			setId(id);
			setFarbe(farbe); 

	}

		public void setFarbe(FarbEnum farbe) {
			this.farbe = farbe;
		}

		public FarbEnum getFarbe() {
			return this.farbe;
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

		@Override
		public String toString() {

			return this.getFarbe().name();
		}

	}
