package treeSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class TreeSetsTest {


	public static void main(String[] args) {

		ArrayList<Mitarbeiter> arbeiter = new ArrayList<>();

		arbeiter.add(new Mitarbeiter("Dieter", 0001));
		arbeiter.add(new Mitarbeiter("Hans-Meier",2023489));
		arbeiter.add(new Mitarbeiter("Violetta",1232));
		arbeiter.add(new Mitarbeiter("Hand-Maria",23212));
		arbeiter.add(new Mitarbeiter("Elke",9232));
		arbeiter.add(new Mitarbeiter("Lisa",231));


		TreeSet<Mitarbeiter> tree1 = new TreeSet<Mitarbeiter>(new NameKomperator());
		for(Mitarbeiter m : arbeiter) {
			tree1.add(m);
		}
		
		TreeSet<Mitarbeiter> tree2 = new TreeSet<Mitarbeiter>(new PersonalnummerKomperator());
		for(Mitarbeiter m : arbeiter) {
			tree2.add(m);
		}

		for(Mitarbeiter m : tree1) {
			System.out.print(m.getName()+" ,");
		}

		System.out.println("");

		for(Mitarbeiter m : tree2) {
			System.out.print(m.getName()+" ,");
		}
	}
}
