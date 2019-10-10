package uebungsblatt1;
import java.util.*;
public class Person {
	private String name;

	public Person(String name) {
		setName(name);
	}

	public void setName(String name) {
		if (name == null || name.length() < 2) {
			throw new RuntimeException ("Der Name muss mehr als zwei Stellen enthalten.");
			}
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

}
