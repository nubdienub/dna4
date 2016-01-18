package Grafen;
import java.util.HashSet;

public class Knooppunt {

	public String naam;
	public HashSet<Zijde> inZijdes, uitZijdes;
	public double vroegsteTijd, laatsteTijd;

	public Knooppunt(String naam) {
		assert (!naam.isEmpty()) : "Geen naam ingevuld";
		this.naam = naam;
		this.inZijdes = new HashSet<Zijde>();
		this.uitZijdes = new HashSet<Zijde>();
	}

	public Knooppunt addzijde(Knooppunt vertex, double gewicht) {
		Zijde zijde = new Zijde(this, vertex, gewicht);
		uitZijdes.add(zijde);
		vertex.inZijdes.add(zijde);
		return this;
	}

	@Override
	public String toString() {
		return naam;
	}

}
