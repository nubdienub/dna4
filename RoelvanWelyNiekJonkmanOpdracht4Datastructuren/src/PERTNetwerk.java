import java.util.HashSet;

import Grafen.GenericGraph;
import Grafen.Knooppunt;
import Grafen.Zijde;

public class PERTNetwerk {

	/**
	 * Constructor
	 * Bouwt het PERT netwerk op
	 */
	public PERTNetwerk(){
		GenericGraph graph = new GenericGraph();
		
		Knooppunt a = new Knooppunt("A");
		Knooppunt b = new Knooppunt("B");
		Knooppunt c = new Knooppunt("C");
		Knooppunt d = new Knooppunt("D");
		Knooppunt e = new Knooppunt("E");
		Knooppunt f = new Knooppunt("F");
		Knooppunt g = new Knooppunt("G");
		
		a.addzijde(b, 3);
		a.addzijde(d, 1);
		a.addzijde(g, 3);
		b.addzijde(c, 1);
		b.addzijde(f, 1);
		d.addzijde(e, 1);
		e.addzijde(f, 1);
		f.addzijde(c, 1);
		g.addzijde(f, 2);
		
		graph.addknooppunt(a);
		graph.addknooppunt(b);
		graph.addknooppunt(c);
		graph.addknooppunt(d);
		graph.addknooppunt(e);
		graph.addknooppunt(f);
		graph.addknooppunt(g);
		
		System.out.println(graph.printGraaf());
		System.out.println(vroegsteTijd(e) + "," + laatsteTijd(e));
	}
	
	public double vroegsteTijd(Knooppunt knooppunt){
		HashSet<Zijde> zijdes = knooppunt.inZijdes;
		//System.out.println("Edges: " + edges);
		if(zijdes.size() == 0) {
			// Geen voorgangers dus tijd = 0
			return 0;
		}else{
			// Vroegste tijd berekenen
			double tijd = 0;
			for(Zijde zijde : zijdes) {
				// Distance berekenen
				double afstand = zijde.gewicht;
				if(zijde.van.vroegsteTijd > 0) { // Vroegste tijd herbruiken
					afstand += zijde.van.vroegsteTijd;
				}else{ // Vroegste tijd berekenen
					afstand += vroegsteTijd(zijde.van);
				}
				
				// Grootste distance pakken
				if(afstand > tijd) {
					tijd = afstand;
				}
				//System.out.println("Distance @ edge " + edge + ": " + distance);
			}
			return tijd;
		}
		
		
	}
	
	public double laatsteTijd(Knooppunt knooppunt){
		HashSet<Zijde> zijdes = knooppunt.uitZijdes;
		if(zijdes.size() == 0) {
			// Geen voorgangers dus tijd = vroegste tijd
			return vroegsteTijd(knooppunt);
		}else{
			// Laatste tijd berekenen
			double tijd = 999;
			for(Zijde zijde : zijdes) {
				// Distance berekenen
				double afstand = -zijde.gewicht;
				if(zijde.naar.laatsteTijd > 0) { // Laatste tijd hergebruiken
					afstand += zijde.naar.laatsteTijd;
				}else{ // Laatste tijd berekenen
					afstand += laatsteTijd(zijde.naar);
				}

				// Kleinste afstand 
				if(afstand < tijd) {
					tijd = afstand;
				}
			}
			return tijd;
		}
		
	}
	
}
