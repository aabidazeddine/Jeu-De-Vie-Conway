package iteration4.services;

/**
 * @author Aabid
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import iteration4.domain.Cellule;
import iteration4.domain.Dimension;
import iteration4.Simulateur;
import iteration4.domain.Table;
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
		File text = new File("src/main/resources/Data/iteration4");
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(text);

		// Recuperer les information depuis le fichier
		int nbrIteration = this.recupererNbrIteration(scnr.nextLine());
		Dimension dimension = this.recupererDimension(scnr.nextLine());
		int i = 1;
		List<String> ligne1 = new ArrayList<String>();

		ligne1.add(scnr.nextLine());
		while (i < dimension.x) {
			ligne1.add(scnr.nextLine());
			i++;
		}
		Table table = this.recupererTable(ligne1, dimension);
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

	public Table recupererTable(List<String> ligne, Dimension dimension) {
		int rowCount = dimension.getX();
		int columnCount = dimension.getY();
		Cellule[][] cellules = new Cellule[rowCount][columnCount];
		for (int i = 0; i < ligne.size(); i++) {
			cellules[i] = conversionStringToCellule(ligne.get(i).split(""));
		}
		return new Table(cellules);
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
