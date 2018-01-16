/**
 * 
 */
package iteration6.domain;

import statutCellule.Statut;

/**
 * @author Aabid Cellule manipulation
 */

public class Cellule {

	/**
	 * 
	 */
	private Statut statut;

	public Cellule() {
		// TODO Auto-generated constructor stub
	}

	public Cellule(Statut statut) {
		super();
		this.statut = statut;
	}

	public Statut getStatut() {
		return statut;
	}

	public boolean isVivante() {
		return Statut.VIVANTE.equals(this.statut);
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
