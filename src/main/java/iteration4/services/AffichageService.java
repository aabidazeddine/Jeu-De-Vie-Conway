/**
 * 
 */
package iteration4.services;

import iteration4.domain.Cellule;
import iteration4.domain.Dimension;
import iteration4.domain.Table;
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

	public void afficherDansConsole(int nbrIteration, Table table, Dimension dimension) {
		System.out.println("\tEvolution " + nbrIteration);
		Cellule[][] cellules = table.getCellules();
		for (int i = 0; i < cellules.length; i++) {
			String ligne = this.ligne(cellules[i]);
			System.out.println("\t\t\t" + ligne);
		}
	}

	public String ligne(Cellule[] cellules) {
		StringBuilder signe = new StringBuilder();
		for (int i = 0; i < cellules.length; i++) {
			signe.append(" " + recupererCellule(cellules[i].getStatut()));
		}
		return signe.toString();

	}

}
