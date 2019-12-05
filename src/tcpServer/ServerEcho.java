package tcpServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
//import java.util.stream.Stream;

public class ServerEcho {

    private ServerSocket server = null;
    private Socket s = null; 
    private BufferedReader in = null; 
    private BufferedWriter out = null; 


    public ServerEcho () {


        try {
            while (true) {
                System.out.println("server starting");
                server = new ServerSocket(1234);
                s = server.accept();
                in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String message = "";
                ArrayList<Integer> daten = new ArrayList<>();
                String kommando = "";
                int ergebnis = 0;
                while (!(message.equalsIgnoreCase("SUM" ) || message.equalsIgnoreCase("MW") )) {
                	message = in.readLine(); 

                    System.out.println("Vom Client kommt: " + message);
                    if(!(message.equalsIgnoreCase("SUM" ) || message.equalsIgnoreCase("MW") )){
                    	String[] zeile = message.split(";");
                    	for(String s : zeile){
                    		daten.add(Integer.parseInt(s));
                    	}
                    		
                    }
                    else {
                    	kommando = message;
                    }
                }
                if(kommando.equalsIgnoreCase("SUM")) {
                	
                	for(int wert : daten) {
                		ergebnis += wert;
                	}
                }
                else if(kommando.equalsIgnoreCase("MW")){
                	for(int wert : daten) {
                		ergebnis += wert;
                	}
                	ergebnis = ergebnis/daten.size();
                }




                out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));


                out.write("SERVER: Danke fuer die Daten");
                out.write("Das gewünschte Ergebnis ist: "+ergebnis);
                out.newLine();
                out.flush();
                this.terminate();
            }
        }
        catch(IOException e ) {
            e.printStackTrace();
        }
        finally {
            this.terminate();
        }



    }


    public void terminate() {
        System.out.println("Server terminated");
        try {
            in.close();
        } catch (Exception e) {}
        try {
            out.close();
        } catch(Exception e) {}

        try {
            server.close();
        } catch(IOException e) {}

    }

}