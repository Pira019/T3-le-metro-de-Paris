import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import service.ServiceMetro;

public class MetroParis {

	public static void main(String[] args) {
		
		ServiceMetro serviceMetro = new ServiceMetro();
		
		
		readFile();


 	\\Exemple d'utilisation: A titre indicatif seulement:

	Trajet t1 = metro.trajetLePlusRapideDijkstra("Bastille", "Belleville");
        Trajet t2 = metro.trajetLePlusRapideBellManFord("Bastille", "Belleville");
	Trajet t3 = metro.trajetLePlusRapideDijkstra("Belleville", "Pablo Picasso");
        Trajet t4 = metro.trajetLePlusRapideBellManFord("Buzenval", "Gare de Lyon");	
	Trajet t5 = metro.trajetLePlusRapideDijkstra("Mirabeau", "Passy");
        Trajet t6 = metro.trajetLePlusRapideBellManFord("Plaisance", "Vavin");


	t1.print();
	t2.print();
	t3.print();
	t4.print();
	t5.print();
	t6.print();


        ArrayList<Station> stationsCritiques = metro.stationsCritiques();
        System.out.println("Stations critiques : " + stationsCritiques);



	}

	
	public static void readFile()
	{
		
		 try {
		      File myObj = new File("./src/metro.txt");
		      Scanner myReader = new Scanner(myObj);
		      String data = myReader.nextLine();
		      System.out.println("Nombre de station et d'arcs" + data);
		      while (myReader.hasNextLine() ) {
		         data = myReader.nextLine();
		    	  if(data.contains("$"))
		    		  	break;
		         String line[]=data.split(" ");
			      System.out.println("La station num�ro  " + Integer.parseInt(data.substring(0, 3)) + "  se nomme " + data.substring(5));

		      }
		      while (myReader.hasNextLine() ) {
			         data = myReader.nextLine();
			    	  if(data.contains("$"))
			    		  	break;
			         String line[]=data.split(" ");
				      System.out.println("La station num�ro  " + Integer.parseInt(line[0]) + "  a la position en x :  " + Integer.parseInt(line[1]) + "  a la position en x :  " + Integer.parseInt(line[2]));

			    }
		      while (myReader.hasNextLine() ) {
			         data = myReader.nextLine();
			    	  if(data.contains("$"))
			    		  	break;
			         String line[]=data.split(" ");
				      System.out.println("le temps requis pour passer de   " + Integer.parseInt(line[0]) + "  a   " + Integer.parseInt(line[1]) + "  est  " + Integer.parseInt(line[2]));

			      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Le fichier ne semble pas exister � l'emplacment donn�e.");
		      e.printStackTrace();
		    }
		
		
		
		
	}
	
	//retourne le trajet le plus rapide entre 2 stations, et le temps requis pour ce trajet. 
	public Trajet trajetLePlusRapideDijkstra (String   debut, String fin) {
		
		return void;
	}
	
	
	//retourne le trajet le plus rapide entre 2 stations, et le temps requis pour ce trajet, avec l'algo de BellManFord. 
	public Trajet trajetLePlusRapideBellManFord (String  debut, String fin) {
		
		return void;
	}
	
		
	
	//retourne la liste des stations qui, si elles sont ferm�s, rendent au moins une station innateignable
	public ArrayList<Station> stationsCritiques()
	{
		
	}

}
