/**
 * 
 */
package iteration5.services;

import iteration5.domain.Cellule;
import iteration5.domain.Table;
import signes.Constantes;
import statutCellule.Statut;

/**
 * @author Aabid Affichage Table de Cellule
 */
public class AffichageService implements IAffichageService {

	/**
	 * 
	 */
	public AffichageService() {
		// TODO Auto-generated constructor stub
	}

	public String recupererCellule(Statut statut) {
		String signe = null;
		if (statut == Statut.VIVANTE) {
			signe = Constantes.PLUS;
		} else if (statut == Statut.MORTE) {
			signe = Constantes.MOINS;
		}
		return signe;
	}

	public void afficherDansConsole(int nbrIteration, Table table) {
		System.out.println("\tEvolution " + nbrIteration);
		this.ligne(table.getCellules());

	}

	/**
	 * Methode formater les lignes de la table
	 * 
	 * @param cells
	 * 
	 */
	public void ligne(Cellule[] cellules) {
		for (int i = 1; i < cellules.length; i++) {
			System.out.println("\t\t\t" + recupererCellule(cellules[i].getStatut()));
		}

	}

}
