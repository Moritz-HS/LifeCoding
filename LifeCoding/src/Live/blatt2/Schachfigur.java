package Live.blatt2;

public class Schachfigur {

	private FarbEnum farbe;
	private EnumFigurTyp figurTyp;
	
	public Schachfigur(FarbEnum farbe, EnumFigurTyp figurTyp) {
		setFigurTyp(figurTyp);
		setFarbe(farbe);
		
	}
	
	public void setFarbe(FarbEnum farbe) {
		this.farbe = farbe;
	}
	
	public FarbEnum getFarbe() {
		return this.farbe;
	}
	
	public void setFigurTyp(EnumFigurTyp figurTyp) {
		this.figurTyp = figurTyp;
	}
	public EnumFigurTyp getFigurTyp() {
		return this.figurTyp;
	}
}
