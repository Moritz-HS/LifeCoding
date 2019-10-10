package uebungsblatt1;

public class Mitarbeiter extends Person{
	private int mitarbeiterNummer;
	
	public Mitarbeiter(String name,int mitarbeiternummer) {
		super(name);
		setMitarbeiterNummer(mitarbeiternummer);
	}
	
	public void setMitarbeiterNummer(int mitarbeiternummer) {
		this.mitarbeiterNummer=mitarbeiternummer;
	}
	
	public int getMitarbeiterNummer() {
		return this.mitarbeiterNummer;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null)return false;
		if(this.getClass()!=o.getClass())return false;
		return this.hashCode()==o.hashCode();
	}
	
	@Override
	public int hashCode() {
		return getMitarbeiterNummer();
	}
	
	@Override
	public String toString() {
		return "Name: "+getName()+"\n"
				+ "MitarbeiterNummer: "+ getMitarbeiterNummer();
			
	}

}
