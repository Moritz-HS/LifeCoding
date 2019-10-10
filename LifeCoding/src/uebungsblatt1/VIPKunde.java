package uebungsblatt1;

public class VIPKunde extends Geschaeftskunde {
	
	public VIPKunde(String name,int kundennummer) {
		super(name,kundennummer,20);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null)return false;
		if(this.getClass()!=o.getClass())return false;
		return this.hashCode()==o.hashCode();
	}
	
	@Override
	public int hashCode() {
		return getKundennummer();
	}
	
	@Override
	public String toString() {
		return "Name: "+getName()+"\n"
				+ "Kundennummer: "+getKundennummer()+"\n"
				+ "Rabatt: "+getRabatt();
	}
}
