package treeSet;

public class Mitarbeiter {
	private String name;
	private int personalnummer;
	
	public Mitarbeiter(String name, int personalnummer) {
		setName(name);
		setPersonalnummer(personalnummer);
	}
	
	public void setName(String name) {
		if(name == null) {
			throw new RuntimeException("Kein Name uebergeben.");
		}
		this.name=name;
	}
	
	public void setPersonalnummer(int personalnummer) {
		
		this.personalnummer=personalnummer;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPersonalnummer() {
		return this.personalnummer;
	}
}
