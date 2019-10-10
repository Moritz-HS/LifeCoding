package uebungsblatt1;
import java.util.ArrayList;

public class SimonsLoesung {
	



		public static void main (String args[]) {


			int [][] daten = {{}, {2,3}};

			int x  = 0;

			int[] erg = getGroesser(daten, x);

			for (int i = 0; i < daten.length; i++) {
				System.out.println(erg[i]);
			}
			
		

			


		}



		public static int [] getGroesser (int array [][], int x) {



			if (array == null | array.length == 0) {
				System.out.println("Das Array ist leer");
				int[] arr = {};
				return arr; 
			}

			int[] erg = new int [50];


			


					int zeile = 0;
					int index = 0;
					do {
						
						if (array[zeile] != null && array[zeile].length != 0) {
						
						int spalte = 0; 
						do {
							if (array[zeile][spalte] > x) {
								 int zahl = array[zeile][spalte];
								 erg[index] = zahl;
								 index++;
							}
						
							
			
							spalte++;
						} while (spalte < array[zeile].length);
			
			
						}
			
						zeile++;
						
					} while (zeile < array.length);


//					for (int[] arr : array) {
//						if (arr != null && arr.length!=0) {
//							for (int zahl : arr) {
//								if (zahl > x) {
//									System.out.println(zahl);
//								}
//							}
//						}
//					}



//			int zeile = 0; 
//			int index = 0; 
	//
//			while (zeile < array.length) {
	//
//				if (array[zeile] != null && array[zeile].length != 0) {
	//
//					int spalte = 0; 
	//
//					while (spalte < array[zeile].length) {
	//
//						if (array[zeile][spalte] > x) {
//							arr[index] = array[zeile][spalte];
//							index++;
//						}
	//
//						spalte++;
//					}
	//
//					
//				}
//				
//				zeile++;
	//
//			}


			return erg; 








		}





		

	}


