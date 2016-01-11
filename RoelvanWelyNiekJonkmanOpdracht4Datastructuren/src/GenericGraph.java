import java.util.HashSet;

public class GenericGraph {
	private HashSet<Knooppunt> knooppunten;

	/**
	 * Constructor van Generic Graph
	 */
	public GenericGraph() {
		knooppunten = new HashSet<Knooppunt>();
	}
	
	

	/**
	 * Voeg een knooppunt(knooppunt) toe aan het netwerk
	 * 
	 * @param knooppunt De knooppunt (knooppunt)
	 */
	public void addknooppunt(Knooppunt knooppunt) {
		assert (!knooppunten.contains(knooppunt)) : "knooppunt komt al voor in het netwerk";
		knooppunten.add(knooppunt);
	}
	
	

	/**
	 * Controleert of deze knooppunt al bestaat in het netwerk
	 * 
	 * @param knooppunt
	 *            De knooppunt die gecontroleerd moet worden
	 * @return True als hij bestaat
	 */
	public boolean hasknooppunt(Knooppunt knooppunt) {
		assert (knooppunt != null) : "knooppunt mag niet null zijn";
		return knooppunten.contains(knooppunt);
	}

	/**
	 * Returned de knooppunten (set)
	 * 
	 * @return Set met vertices
	 */
	public HashSet<Knooppunt> getKnooppunten() {
		return knooppunten;
	}

	/**
	 * Methode om te controleren of de verbinding tussen twee
	 * knooppunten bestaat
	 * 
	 * @param van
	 *            De vanaf-knooppunt
	 * @param naar
	 *            De naar-knooppunt
	 * @return True als de verbinding al bestaat
	 */
	public boolean checkVerbinding(Knooppunt van, Knooppunt naar) {
		for (Knooppunt knooppunt : knooppunten) {
			if (knooppunt.inZijdes.contains(van) && knooppunt.outZijdes.contains(naar)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Kijkt of de graph nog inkomende edges heeft
	 * 
	 * @return Set met vertices
	 */
	public HashSet<Knooppunt> checkInkomendeEdges() {
		HashSet<Knooppunt> set = new HashSet<Knooppunt>();
		for (Knooppunt knooppunt : knooppunten) {
			if (knooppunt.inZijdes.size() == 0) {
				set.add(knooppunt);
			}
		}
		return set;
	}

	/**
	 * Geeft alle knooppunten aan de rand
	 * 
	 * @return Set met knooppunten
	 */
	public HashSet<Knooppunt> getEdgeVertices() {
		HashSet<Knooppunt> set = new HashSet<Knooppunt>();

		for (Knooppunt knooppunt : knooppunten) {
			if (knooppunt.inZijdes.size() == 0) {
				set.add(knooppunt);
			}
		}

		return set;
	}

}
