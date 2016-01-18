package Grafen;

public class Zijde {
	
	public Knooppunt van;
	public Knooppunt naar;
	public double gewicht;
	
	public Zijde(Knooppunt van, Knooppunt naar, double gewicht) {
		assert (van != null) : "Van Knooppunt niet ingevuld";
		assert (naar != null) : "Naar vertex niet ingevuld";
		this.van = van;
		this.naar = naar;
		this.gewicht = gewicht;
	}
	
	public String toString() {
		return van.toString() + " ==> " + naar.toString();
	}

}
