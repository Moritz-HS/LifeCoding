package aufgabenblatt1_Loesung_04_Oktober;

public class Kunde extends Person {
	
	
private int kundenNummer;
private double rabatt;

	public Kunde (String name, int kundenNummer) {
		super(name);
		if (kundenNummer < 1000 || kundenNummer > 9999) {
			throw new RuntimeException ("Ein Kundennumer besteht aus genau vier Stellen!");
		}
		this.kundenNummer = kundenNummer;
	}
	
	
	public int getKundenNummer() {
		return this.kundenNummer;
		
	}

	public void setRabatt (double rabatt) {
		if (rabatt < 0.0 || rabatt > 100.0) {
			throw new RuntimeException ("Rabatt liegt immer zwischen 0 und 100 Prozent");
		}
		
		this.rabatt = rabatt;
	}

	public double getRabatt() {
		return this.rabatt;
	}



}
