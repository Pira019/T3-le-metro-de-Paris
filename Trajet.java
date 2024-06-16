import java.util.ArrayList;

public class Trajet {

	
	private ArrayList<Station> listeDesStationsDuTrajet;
	private int tempsRequis;
	
	
	public Trajet(ArrayList<Station> listeDesStationsDuTrajet, int tempsRequis) { 
		
		this.listeDesStationsDuTrajet = listeDesStationsDuTrajet;
		this.tempsRequis = tempsRequis;
	}


	/**
	 * @return the listeDesStationsDuTrajet
	 */
	public ArrayList<Station> getListeDesStationsDuTrajet() {
		return listeDesStationsDuTrajet;
	}
 
	/**
	 * @return the tempsRequis
	 */
	public int getTempsRequis() {
		return tempsRequis;
	} 
	 
	// Imprime le trajet dans la console, une station par ligne, et le temps total requis. 	
 	private void Print() {
 		for (Station station : listeDesStationsDuTrajet) {
            System.out.println(station);
        }
        System.out.println("Temps total requis: " + tempsRequis + " secondes");
 	}
}
