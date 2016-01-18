package Grafen;
import java.util.HashSet;

public class GenericGraph {
	private HashSet<Knooppunt> knooppunten;

	public GenericGraph() {
		knooppunten = new HashSet<Knooppunt>();
	}

	public void addknooppunt(Knooppunt knooppunt) {
		assert (!knooppunten.contains(knooppunt)) : "knooppunt komt al voor in het netwerk";
		knooppunten.add(knooppunt);
	}
	
	public String printGraaf(){		
		StringBuilder sb = new StringBuilder();

		for(Knooppunt k : knooppunten){
			sb.append(k.naam + "[label="+k.naam+"]\n");
		}
		
		for (Knooppunt k : knooppunten) {
			for (Zijde z : k.uitZijdes) {
				sb.append(k.naam + " -> " + z.naar.naam + "[label="+ (int)z.gewicht +"]" + "\n" );
			}
		}
		
		return sb.toString();
		
	}
}
