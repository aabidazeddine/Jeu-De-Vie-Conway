/**
 * 
 */
package iteration1.services;

import iteration1.domain.Table;
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

	public void afficherCellule(Statut statut) {
		String signe = null;
		if (statut == Statut.VIVANTE) {
			signe = Constantes.PLUS;
		} else if (statut == Statut.MORTE) {
			signe = Constantes.MOINS;
		}
		System.out.println("\t\t\t" + signe);
	}

	/**
	 * Methode printInConsole Affichage du resultat dans la console
	 * 
	 * @param nbrIteration
	 * @param table
	 */
	public void afficherDansConsole(int nbrIteration, Table table) {
		System.out.println("\tEvolution " + nbrIteration);
		afficherCellule(table.getCellule().getStatut());

	}

}
