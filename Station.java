
public class Station {
	 
	private String nom;
	private int numero; 
	
	private int positionX;
    private int positionY;
    
    private boolean enService;

    
    
	public Station(String nom, int numero, int positionX, int positionY) {
		super();
		this.nom = nom;
		this.numero = numero;
		this.positionX = positionX;
		this.positionY = positionY;
		enService = true;
	}

	
	@Override
	public String toString() {
		return "Station [nom=" + nom + "]";
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the positionX
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * @param positionX the positionX to set
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	/**
	 * @return the positionY
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * @param positionY the positionY to set
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	/**
	 * @return the enService
	 */
	public boolean isEnService() {
		return enService;
	}

	/**
	 * @param enService the enService to set
	 */
	public void setEnService(boolean enService) {
		this.enService = enService;
	}
    
    
	
	 

}
