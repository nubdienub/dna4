import java.util.HashSet;

public class Knooppunt {

	public String name;
	public HashSet<Zijde> inZijdes, outZijdes;
	public double vroegsteTijd, laatsteTijd;

	/**
	 * Constructor van een knooppunt
	 * 
	 * @param name De naam van de vertex
	 */
	public Knooppunt(String name) {
		assert (!name.isEmpty()) : "Geen naam ingevuld";
		this.name = name;
		this.inZijdes = new HashSet<Zijde>();
		this.outZijdes = new HashSet<Zijde>();
	}

	/**
	 * Voegt een nieuwe zijde toe
	 * 
	 * @param knooppunt
	 *            Knooppunt van de outer zijde
	 * @param gewicht
	 *            Het gewicht van de zijde
	 * @return De huidige vertex
	 */
	public Knooppunt addzijde(Knooppunt vertex, double gewicht) {
		Zijde zijde = new Zijde(this, vertex, gewicht);
		outZijdes.add(zijde);
		vertex.inZijdes.add(zijde);
		return this;
	}

	/**
	 * Print de vertex (naam)
	 */
	@Override
	public String toString() {
		return name;
	}

}
