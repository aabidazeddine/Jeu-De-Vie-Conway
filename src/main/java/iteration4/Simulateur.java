/**
 * 
 */
package iteration4;

import iteration4.domain.Dimension;
import iteration4.domain.Table;
import iteration4.services.AffichageService;

/**
 * @author Aabid
 *
 */
public class Simulateur {

	/**
	 * 
	 */
	private AffichageService affichage;
	private Dimension dimension;
	private int nbrIteration;
	private Table table;

	public Simulateur(Dimension dimension, int nbrIteration, Table table2) {
		this.dimension = dimension;
		this.nbrIteration = nbrIteration;
		this.table = table2;
	}

	public Simulateur() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Demarer l'evolution du table
	 */

	public void go() {
		affichage.afficherDansConsole(0, table, dimension);
		for (int i = 1; i <= this.nbrIteration; i++) {
			table.evolution();
			affichage.afficherDansConsole(i, table, dimension);
		}
	}

	public void setAffichage(AffichageService affichage) {
		this.affichage = affichage;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public int getNbrIteration() {
		return nbrIteration;
	}

	public void setNbrIteration(int nbrIteration) {
		this.nbrIteration = nbrIteration;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((affichage == null) ? 0 : affichage.hashCode());
		result = prime * result + ((dimension == null) ? 0 : dimension.hashCode());
		result = prime * result + nbrIteration;
		result = prime * result + ((table == null) ? 0 : table.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Simulateur other = (Simulateur) obj;
		if (affichage == null) {
			if (other.affichage != null)
				return false;
		} else if (!affichage.equals(other.affichage))
			return false;
		if (dimension == null) {
			if (other.dimension != null)
				return false;
		} else if (!dimension.equals(other.dimension))
			return false;
		if (nbrIteration != other.nbrIteration)
			return false;
		if (table == null) {
			if (other.table != null)
				return false;
		} else if (!table.equals(other.table))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Simulateur [affichage=" + affichage + ", dimension=" + dimension + ", nbrIteration=" + nbrIteration
				+ ", table=" + table + "]";
	}

}
