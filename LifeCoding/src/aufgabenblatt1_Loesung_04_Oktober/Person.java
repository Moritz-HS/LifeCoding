package aufgabenblatt1_Loesung_04_Oktober;


public class Person {
	
	private String name;
	
	public Person(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name == null || name.length()<2) {
			throw new RuntimeException("Bitte gültigen Namen eingeben");
		}
		this.name = name;
	}
}
