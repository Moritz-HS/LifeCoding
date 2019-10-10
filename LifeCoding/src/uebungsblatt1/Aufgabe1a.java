package uebungsblatt1;
import java.util.*;
public class Aufgabe1a {

	public static void main(String[] args) {
		int[][] array1 = null;
		int[][] array2 = {};
		int[][] array3 = {{3,5,2,3,7,12,53,62,37,23},{},{856,28,38,59,28,483,25,589,0,23},null};
	//	System.out.println(getGroesserAlsForEach(array1,15));
	//	System.out.println(getGroesserAlsForEach(array2,15));
		System.out.println(Arrays.toString(getGroesserAlsFor(array3,15)));
		System.out.println(Arrays.toString(getGroesserAlsForEach(array3,15)));
		System.out.println(Arrays.toString(getGroesserAlsWhile(array3,15)));
		System.out.println(Arrays.toString(getGroesserAlsDoWhile(array3,15)));
	}
	
//	public static int getGroesserAlsFor(int[][] array,int vz) {
//		int ergebnis = 0;
//		if(array == null || array.length == 0) {
//			System.out.println("Das Array ist leer oder existiert nicht");
//			return ergebnis;
//		}		
//		
//		for(int i=0;i<array.length;i++) {
//			if(array[i]!=null && array[i].length != 0) {
//				for(int a=0;a<array[i].length;a++) {
//					if(array[i][a]>vz)ergebnis++;
//				}
//			}
//		}
//		
//		return ergebnis;
//	}
	
	public static int[] getGroesserAlsFor(int[][] array,int vz) {
	
	int index = 0;
	if(array == null || array.length == 0) {
		throw new RuntimeException("Array ist leer oder existiert nicht");
	}
	
	
	
	for(int i=0;i<array.length;i++) {
		
		if(array[i]!=null && array[i].length != 0) {
			
			for(int a=0;a<array[i].length;a++) {
				
				if(array[i][a]>vz) {
				
					index++;
				}
			}
		}
	}
	
	
	int[]ergebnis = new int [index];
	
	index = 0;
	for(int i=0;i<array.length;i++) {
		
		if(array[i]!=null && array[i].length != 0) {
			
			for(int a=0;a<array[i].length;a++) {
				
				if(array[i][a]>vz) {
					ergebnis[index]=array[i][a];
					index++;
				}
			}
		}
	}
	
	return ergebnis;
}
	
	public static int[] getGroesserAlsForEach(int[][] array, int vz) {

		int index = 0;
		if(array == null || array.length == 0) {
			throw new RuntimeException("Array ist leer oder existiert nicht");
		}
		for(int[] speicherArray : array) {
			if(speicherArray!=null && speicherArray.length!=0) {
				for(int b : speicherArray) {
					if(b>vz) {
						index++;
					}
				}	
			}
				
		}
		
		int[] ergebnis = new int [index];
		index = 0;
		if(array == null || array.length == 0) {
			throw new RuntimeException("Array ist leer oder existiert nicht");
		}
		for(int[] speicherArray : array) {
			if(speicherArray!=null && speicherArray.length!=0) {
				for(int b : speicherArray) {
					if(b>vz) {
						ergebnis[index]=b;
						index++;
					}
				}	
			}
				
		}
		return ergebnis;
	}
	
	public static int[] getGroesserAlsWhile(int[][] array,int vz) {
		int[] ergebnis = new int [100];
		int index = 0;
		int zaehler1 = 0;
		
		
		if(array==null||array.length==0) {
			throw new RuntimeException("Array ist leer oder existiert nicht");
		}
		while(zaehler1<array.length) {
			
			if(array[zaehler1]!=null && array[zaehler1].length!=0) {
				int zaehler2 = 0;
				while(zaehler2<array[zaehler1].length) {
					if(array[zaehler1][zaehler2]>vz) {
						ergebnis[index]=array[zaehler1][zaehler2];
						index++;
					}
					zaehler2++;
				}
			}
			zaehler1++;
		}
		
		return ergebnis;
	}

	
	public static int[] getGroesserAlsDoWhile(int[][] array, int vz) {
		int[] ergebnis = new int [100];
		int index = 0;
		int zaehler1 = 0;
		
		
		if(array==null || array.length==0) {
			throw new RuntimeException("Array ist leer oder existiert nicht");
		}
		
		do {
			if(array[zaehler1]!=null && array[zaehler1].length!=0) {
				int zaehler2 = 0;
				do {
					if(array[zaehler1][zaehler2]>vz) {
						ergebnis[index]=array[zaehler1][zaehler2];
						index++;
					}
					zaehler2++;
				}while(zaehler2<array[zaehler1].length);
			}
			zaehler1++;
		}while(zaehler1<array.length);
		
		return ergebnis;
	}
	


}
