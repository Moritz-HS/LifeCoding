package tcpServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientEcho {
	private static Socket s = null; 
	private static BufferedReader in = null; 
	private static BufferedWriter out = null; 

	public static void main (String []args) {

		ArrayList<ArrayList<Integer>> daten = new ArrayList<>();
		ArrayList <Integer> a1 = new ArrayList<>();
		a1.add(13);
		a1.add(12);
		a1.add(10);
		daten.add(a1);
		ArrayList <Integer> a2 = new ArrayList<>();
		a2.add(130);
		a2.add(122);
		a2.add(1010);
		daten.add(a2);
		daten.add(null);
		ArrayList <Integer> a3 = new ArrayList<>();
		a3.add(444);
		a3.add(4);
		a3.add(1111);
		daten.add(a3);
		
		
		starteClient(daten, "SUM");
	}	
	public static void starteClient(ArrayList<ArrayList<Integer>>daten, String kommando) {
		try {
			System.out.println("client starting");
			
			s = new Socket("localhost", 1234);
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			for (int i = 0; i < daten.size(); i++) {
				if (daten.get(i) != null) {
					for (int j = 0; j < daten.get(i).size(); j++) {
						 
						  out.write(Integer.toString(daten.get(i).get(j)));
						  out.write(';');
					}
					// Zeilenumbruch
					out.newLine();
				}
			}
			if (kommando == null) {
				throw new RuntimeException ("Bitte geben Sie ein Rechenkommando an!");	
			}
			if (kommando.equalsIgnoreCase("SUM")) {
				
				out.write("SUM");
				out.newLine();
				out.flush();
			}
			else if (kommando.equalsIgnoreCase("MW")) {
				
				out.write("MW");
				out.newLine();
				out.flush();
			}
			else {
				throw new RuntimeException("Irgendwas ist bei der Kommandozuweisung schiefgelaufen!");
			}
			
			
			
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String text = in.readLine(); 
			System.out.println(text);
			System.out.println("client terminated");
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (Exception e) {}
			try {
				out.close();
			} catch(IOException e) {}
		}
	}

}
