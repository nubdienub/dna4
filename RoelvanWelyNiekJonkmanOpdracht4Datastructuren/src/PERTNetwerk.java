import java.util.ArrayList;

import Grafen.GenericGraph;
import Grafen.Knooppunt;

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
		a.addzijde(g, 1);
		b.addzijde(c, 1);
		b.addzijde(f, 1);
		d.addzijde(e, 1);
		e.addzijde(f, 1);
		g.addzijde(f, 2);
		
		graph.addknooppunt(a);
		graph.addknooppunt(b);
		graph.addknooppunt(c);
		graph.addknooppunt(d);
		graph.addknooppunt(e);
		graph.addknooppunt(f);
		graph.addknooppunt(g);
		
		System.out.println(graph.printGraaf());
	}
	
	public void vroegsteTijden(){
		
	}
	
	public void laatsteTijden(){
		
	}
	
}
