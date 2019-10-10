package aufgabenblatt1_Loesung_04_Oktober;

public class Aufgabe1 {

	public static void main (String[] args) {
		
		int[][] daten = null;
		int x = 5;
		int [] ergebnis  = groeßereFinden(daten, x);
		
		int i = 0;
		if(ergebnis.length==0) {
			System.out.println("Keine Zahl größer als x enthalten in Daten.");
		}
		while (i<ergebnis.length) {
			System.out.println(ergebnis[i]);
			i++;
		}
	}
	
	public static int[] groeßereFinden(int [][] daten , int x ) {
		
		if(daten == null || daten.length == 0) {
			 throw new RuntimeException("Array ist leer oder existiert nicht");
			
		}
		
		int count = 0;
		int i = 0;
		while (i<daten.length) {
			if(daten[i] != null && daten[i].length != 0 ) {
				int j = 0;
				while(j < daten[i].length) {
					if(daten[i][j] > x) {
						count++;
					}
					j++;
				}
			}
			i++;
		}
		
		int [] rückgabe = new int [count];
		if(count != 0) {
			int counter = 0;
			i = 0;
			while(i < daten.length) {
				if(daten[i] != null && daten[i].length != 0 ) {
					int j = 0;
					while(j < daten[i].length) {
						if(daten [i][j] > x ) {
							rückgabe [counter] = daten [i][j];
							counter++;
						}
						j++;
				}
				
			}
				i++;	
		}
	
		
		}
	
		return rückgabe;
	}				
}
