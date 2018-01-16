package iteration5.services;

/**
 * @author Aabid
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import iteration5.Simulateur;
import iteration5.domain.Cellule;
import iteration5.domain.Dimension;
import iteration5.domain.Table;
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
		File text = new File("src/main/resources/Data/iteration5");
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(text);

		// Recuperer les information depuis le fichier
		int nbrIteration = this.recupererNbrIteration(scnr.nextLine());
		Dimension dimension = this.recupererDimension(scnr.nextLine());
		int i = 1;
		List<String> lines1 = new ArrayList<String>();
		// lines1.add(scnr.nextLine());
		while (i <= dimension.x + 1) {
			lines1.add(scnr.nextLine());
			i++;
		}

		Table table = this.recupererTable(lines1, dimension);
		Simulateur simulateur = new Simulateur(dimension, nbrIteration, table);

		return simulateur;
	}

	public int recupererNbrIteration(String lines) {
		return Integer.parseInt(lines);

	}

	public Dimension recupererDimension(String lines) {
		String[] dims = lines.split("x");
		int x = Integer.parseInt(dims[0]);
		int y = Integer.parseInt(dims[1]);
		return new Dimension(x, y);
	}

	public Table recupererTable(List<String> lines, Dimension dimension) {

		int rowCount = dimension.getX();
		String[] signs = lines.toArray(new String[rowCount]);

		Cellule[] cells = null;
		if (signs.length > 1) {
			cells = conversionStringTabToCellule(signs);

		} else {
			cells = conversionStringTabToCellule(signs[0].split(""));

		}
		return new Table(cells);
	}

	public Cellule[] conversionStringTabToCellule(String[] s) {
		Cellule[] result = new Cellule[s.length];
		for (int i = 0; i < s.length; i++) {
			if (Constantes.PLUS.equals(s[i])) {
				result[i] = new Cellule((Statut.VIVANTE));
			} else {
				result[i] = new Cellule((Statut.MORTE));
			}
		}
		return result;
	}

}
