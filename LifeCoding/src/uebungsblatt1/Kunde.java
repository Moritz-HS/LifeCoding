package uebungsblatt1;
import java.util.*;

public class Kunde extends Person {
	private int kundennummer;
	private int rabatt;
	//tests
	//noch mehr tests
	//langsam fallen mir keine Tests mir ein
	
	public Kunde(String name, int kundennummer, int rabatt) {
		super(name);
		setKundennummer(kundennummer);
		setRabatt(rabatt);
	}
	
	public void setKundennummer(int kundennummer){
	//	String str = Integer.toString(kundennummer);
	//	String str = String.format("%04d", kundennummer);
		if(kundennummer>9999 || kundennummer < 1000) {
			throw new RuntimeException("Die Kundennummer muss vierstellig sein");
		}
		
		this.kundennummer=kundennummer;
	}
	
	public void setRabatt(int rabatt) {
		if(rabatt<0 || rabatt > 100) {
			throw new RuntimeException("Der Rabatt muss zwischen 0% und 100% betragen");
		}
		
		this.rabatt=rabatt;
	}
	
	public int getRabatt() {
		return this.rabatt;
	}
	
	public int getKundennummer() {
		return this.kundennummer;
	}
	
}
