package aufgabenblatt1_Loesung_04_Oktober;


public class VIPKunde extends Geschaeftskunde {
	 public final int RABATT = 20;
	public VIPKunde(String name, int kundenNr) {
		super(name,kundenNr);
		setRabatt(this.RABATT);
	}
	
@Override
public void setRabatt(double rabatt) {
	if(rabatt != 20) {
		throw new RuntimeException("Der Kundenrabatt von VIP betraegt immer 20 Prozent.");
	}
}

@Override
public double getRabatt() {
	return this.RABATT;
}

@Override
public String toString() {
	return "Name: "+getName()+"\n"
			+ "Kundennummer: "+getKundenNummer()+"\n"
			+ "Rabatt: "+getRabatt();
}
}
