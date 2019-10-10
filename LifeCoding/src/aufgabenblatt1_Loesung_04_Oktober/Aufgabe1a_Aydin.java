package aufgabenblatt1_Loesung_04_Oktober;

public class Aufgabe1a_Aydin{
	
	public static void main (String[] args) {
		
		int[][] daten = {{}, null,{1,2}, {20, 18, -3, 7, 22}};
		int x = 5;
		int [] ergebnis  = groe�ereFinden(daten, x);
		
		int i = 0;
		while (i<ergebnis.length) {
			System.out.print(ergebnis[i] + ", ");
			i++;
		}
	}
	
	public static int[] groe�ereFinden(int [][] daten , int x ) {
		
		if(daten == null || daten.length == 0) {
			 throw new RuntimeException("Keine Zahl gr��er als x enthalten in Daten.");
			
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
		
		int [] r�ckgabe = new int [count];
		if(count != 0) {
			int counter = 0;
			i = 0;
			while(i < daten.length) {
				if(daten[i] != null && daten[i].length != 0 ) {
					int j = 0;
					while(j < daten[i].length) {
						if(daten [i][j] > x ) {
							r�ckgabe [counter] = daten [i][j];
						}
						j++;
				}
				i++;
			}
		}
	
		
		}
		return r�ckgabe;
	}				
}