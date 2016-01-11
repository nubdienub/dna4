
public class Zijde {
	
	public Knooppunt from;
	public Knooppunt to;
	public double gewicht;
	
	/**
	 * Constructor van de Zijde (verbinding), tussen 2 Knooppunten
	 * @param van Knooppunt dat de "van" representeert
	 * @param naar Knooppunt dat de "naar" representeert
	 * @param gewicht tussen de 2 punten
	 */
	public Zijde(Knooppunt van, Knooppunt naar, double gewicht) {
		assert (van != null) : "Van Knooppunt niet ingevuld";
		assert (naar != null) : "Naar vertex niet ingevuld";
		this.from = van;
		this.to = naar;
		this.gewicht = gewicht;
	}
	
	/**
	 * Print de verbinding
	 */
	public String toString() {
		return from.toString() + " ==> " + to.toString();
	}

}
