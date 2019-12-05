package treeSet;

import java.util.Comparator;


public class NameKomperator implements  Comparator <Mitarbeiter> {
	
	@Override
	public int compare(Mitarbeiter m1, Mitarbeiter m2) {
		return (m1.getName().compareTo(m2.getName()));
	}
}
