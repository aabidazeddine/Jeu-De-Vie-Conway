package iteration3.services;

/**
 * @author Aabid
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import iteration3.Simulateur;
import iteration3.domain.Cellule;
import iteration3.domain.Dimension;
import iteration3.domain.Table;
import signes.Constantes;
import statutCellule.Statut;

public class ChargementFichierService implements IChargementFichierService {

	public ChargementFichierService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Charger le fichier de donnee pour recuperer les informations du jeu
	 */
	public Simulateur charger() throws FileNotFoundException {
		// reference du fichier
		File text = new File("src/main/resources/Data/iteration3");
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(text);

		// Recuperer les information depuis le fichier
		int nbrIteration = this.recupererNbrIteration(scnr.nextLine());
		Dimension dimension = this.recupererDimension(scnr.nextLine());
		Table table = this.recupererTable(scnr.nextLine());
		Simulateur simulateur = new Simulateur(dimension, nbrIteration, table);

		return simulateur;
	}

	public int recupererNbrIteration(String ligne) {
		return Integer.parseInt(ligne);

	}

	public Dimension recupererDimension(String ligne) {
		String[] dims = ligne.split("x");
		int x = Integer.parseInt(dims[0]);
		int y = Integer.parseInt(dims[1]);
		return new Dimension(x, y);
	}

	public Table recupererTable(String ligne) {
		String signsLine = ligne;
		String[] signs = signsLine.split("");
		Cellule[] cells = conversionStringToCellule(signs);
		return new Table(cells);
	}

	public Cellule[] conversionStringToCellule(String[] s) {
		Cellule[] resultat = new Cellule[s.length];
		for (int i = 0; i < s.length; i++) {
			if (Constantes.PLUS.equals(s[i])) {
				resultat[i] = new Cellule((Statut.VIVANTE));
			} else {
				resultat[i] = new Cellule((Statut.MORTE));
			}
		}
		return resultat;
	}

}
