package aufgabenblatt2;

public class Schachfeld {
	private FarbEnum farbe;
	private Schachfigur figur;
	
	public Schachfeld(FarbEnum farbe,Schachfigur figur) {
		setFarbe(farbe);
		setFigur(figur);
	}
	
	public Schachfeld (FarbEnum farbe) {
		setFarbe(farbe);
	}
	
	public Schachfigur getFigur() {
		return this.figur;
	}
	
	public void setFigur(Schachfigur f) {
		this.figur= f;
	}
	
	public FarbEnum getFarbe() {
		return this.farbe;
	}
	
	public void setFarbe(FarbEnum f) {
		this.farbe = f;
	}
}
