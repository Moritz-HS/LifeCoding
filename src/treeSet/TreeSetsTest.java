package treeSet;
import java.util.TreeSet;

public class TreeSetsTest {

	
	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter("Dieter", 0001);
		Mitarbeiter m2 = new Mitarbeiter("Hans-Meier",2023489);
		Mitarbeiter m3 = new Mitarbeiter("Violetta",1232);
		Mitarbeiter m4 = new Mitarbeiter("Hand-Maria",23212);
		Mitarbeiter m5 = new Mitarbeiter("Elke",9232);
		Mitarbeiter m6 = new Mitarbeiter("Lisa",231);
		
		TreeSet<Mitarbeiter> tree1 = new TreeSet<Mitarbeiter>(new NameKomperator());
		tree1.add(m1);
		tree1.add(m2);
		tree1.add(m3);
		tree1.add(m4);
		tree1.add(m5);
		tree1.add(m6);
		
		TreeSet<Mitarbeiter> tree2 = new TreeSet<Mitarbeiter>(new PersonalnummerKomperator());
		tree2.add(m1);
		tree2.add(m2);
		tree2.add(m3);
		tree2.add(m4);
		tree2.add(m5);
		tree2.add(m6);
		
		for(Mitarbeiter m : tree1) {
			System.out.print(m.getName()+" ,");
		}
		
		System.out.println("");
		
		for(Mitarbeiter m : tree2) {
			System.out.print(m.getName()+" ,");
		}
	}
}
