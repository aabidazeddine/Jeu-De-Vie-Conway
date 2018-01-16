package iteration1.services;

/**
 * @author Aabid
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import iteration1.Simulateur;
import iteration1.domain.Cellule;
import iteration1.domain.Table;
import signes.Constantes;
import statutCellule.Statut;

public class ChargementFichierService {

	public ChargementFichierService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Charger le fichier de donnee pour recuperer les informations du jeu
	 */
	@SuppressWarnings("unused")
	public Simulateur charger() throws FileNotFoundException {
		// reference du fichier
		List<String> ligne = null;
		File text = new File("src/main/resources/Data/iteration1");
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(text);

		// Recuperer les information depuis le fichier
		int nbrIteration = this.recupererNbrIteration(scnr.nextLine());
		int dimension = this.recupererDimension(scnr.nextLine());
		Table table = this.recupererTable(scnr.nextLine());
		Simulateur simulateur = new Simulateur(dimension, nbrIteration, table);

		return simulateur;
	}

	/**
	 * Recuperer le nombre d'iteration
	 */
	public int recupererNbrIteration(String ligne) {
		return Integer.parseInt(ligne);

	}

	/**
	 * Recuperer les dimensions
	 */
	public int recupererDimension(String ligne) {
		return Integer.parseInt(ligne);
	}

	/**
	 * Recuperer la table des signes
	 */
	public Table recupererTable(String ligne) {
		Cellule cellule = new Cellule();
		String signe = ligne;
		if (Constantes.PLUS.equals(signe)) {
			cellule.setStatut(Statut.VIVANTE);
		}
		return new Table(cellule);
	}
}
