package treeSet;
import java.util.Comparator;

public class PersonalnummerKomperator implements Comparator<Mitarbeiter> {
	
	@Override
	public int compare(Mitarbeiter m1, Mitarbeiter m2) {
		return (m1.getPersonalnummer() - m2.getPersonalnummer() );
	}
}
