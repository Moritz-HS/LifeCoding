package Live.blatt2.kompPackageSichtbarkeit;


import Live.blatt2.EnumFigurTyp;
import Live.blatt2.FarbEnum;
import Live.blatt2.Schachfigur;

 class Schachfeld {
	FarbEnum farbe;
	Schachbrett brett;
	Schachfigur figur;
	String id;


	//Konstruktor ueberfluessig
	//public Schachfeld() {
//	
//
	//}
	
		// Konstruktor angepasst
		public Schachfeld(String id, FarbEnum farbe, Schachfigur figur) {
			setId(id);
			setFarbe(farbe);
			
		}

		
		// Eine ID darf von aussen nicht veraendert werden
		private void setId (String id) {
			// Wenn der erste Buchstabde der Id nicht zwischen A und H liegt, so wird eine Exeption geworfen
			if ((id.charAt(0) > (char)72) || (id.charAt(0) < (char) 65)) {
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
		
		
		//Keine getBrett im Schachfeld, ergibt keinen Sinn diese Methode muss weg
		public Schachbrett getBrett() {
			return this.brett;
		}

	}
