/**
 * 
 */
package iteration1;

import iteration1.domain.Table;
import iteration1.services.AffichageService;

/**
 * @author Aabid
 *
 */
public class Simulateur {

	/**
	 * 
	 */
	private AffichageService affichage;
	private int dimension;
	private int nbrIteration;
	private Table table;

	public Simulateur() {
		// TODO Auto-generated constructor stub
		super();
	}

	public AffichageService getAffichage() {
		return affichage;
	}

	public void setAffichage(AffichageService affichage) {
		this.affichage = affichage;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public Simulateur(int dimension, int nbrIteration, Table table) {
		super();
		this.dimension = dimension;
		this.nbrIteration = nbrIteration;
		this.table = table;
	}

	/**
	 * Demarer l'evolution du table
	 */
	public void go() {
		affichage.afficherDansConsole(0, table);
		for (int i = 1; i <= this.nbrIteration; i++) {
			table.evolution();
			affichage.afficherDansConsole(i, table);
		}

	}

	public void setPrint(AffichageService print) {
		this.affichage = print;
	}

}
