/**
 * 
 */
package iteration3.services;

import iteration3.domain.Cellule;
import iteration3.domain.Table;
import signes.Constantes;
import statutCellule.Statut;

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

	/**
	 * Methode printInConsole Affichage du resultat dans la console
	 * 
	 * @param nbrIteration
	 * @param table
	 */
	public void afficherDansConsole(int nbrIteration, Table table) {
		String ligne = this.ligne(table.getCellules());
		System.out.println("\tEvolution " + nbrIteration);
		System.out.println("\t\t\t" + ligne);

	}

	/**
	 * Methode formater les lignes de la table
	 * 
	 * @param cells
	 * 
	 */
	public String ligne(Cellule[] cellules) {
		StringBuilder signe = new StringBuilder();
		for (int i = 0; i < cellules.length; i++) {
			signe.append(" " + recupererCellule(cellules[i].getStatut()));
		}
		return signe.toString();

	}

}
