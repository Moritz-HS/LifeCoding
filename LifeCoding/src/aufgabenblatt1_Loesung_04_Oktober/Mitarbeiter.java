package aufgabenblatt1_Loesung_04_Oktober;

public class Mitarbeiter extends Person{
	private int persoNr;
	
	public Mitarbeiter(String name, int persoNr) {
		super(name);
		this.persoNr = persoNr;
		
	}
	public int getPersoNr() {
		return persoNr;
	}

	
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Mitarbeiter m = (Mitarbeiter) o;
		return (this.persoNr == m.getPersoNr());
		
	}
	@Override
	public String toString() {
		return ("Ich bin: " + getName() + "mit der Personalnummer: " + getPersoNr());
	}
	

}
