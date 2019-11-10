package Live.blatt2;

import Live.blatt2.kompPackageSichtbarkeit.*;
//import Live.blatt2.kompKonstruktor.Schachbrett;


public class Main {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub

		Schachbrett b = new Schachbrett();
//		System.out.println(b.getAlleFelder()[0][0].toString()); geht nicht!
		System.out.println(b.toString());
		//Schachfeld schachfeld = new Schachfeld(); geht nicht!
		System.out.println(b.getSchachfeld("H1"));
		System.out.println(b.brettToString());
		
	}

}
