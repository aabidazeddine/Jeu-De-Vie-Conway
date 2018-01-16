package iteration4.domain;

import java.util.Arrays;

import iteration4.domain.Cellule;
import statutCellule.Statut;

public class Table {

	Cellule[][] cellules;

	public Table(Cellule[][] cellules) {
		// TODO Auto-generated constructor stub
		this.cellules = cellules;

	}

	public Cellule[][] getCellules() {
		return cellules;
	}

	public void setCellules(Cellule[][] cellules) {
		this.cellules = cellules;
	}

	public Statut nouveauStatut(int i, int j) {
		return verifierVoisins(i, j, this);
	}

	/**
	 * Verifier l'etat des cellules voisins
	 *
	 */
	public int nombreVivante(int i, int j) {
		int nombreVivante = 0;
		int living = 0;
		if (this.ifVivante(i, j)) {
			living = 1;
		}
		for (int k = i - 1; k <= i + 1; k++) {
			for (int h = j - 1; h <= j + 1; h++) {
				if (this.ifVivante(k, h)) {
					nombreVivante += 1;
				}

			}
		}
		return nombreVivante - living;
	}

	/**
	 * Evolution
	 *
	 */
	public void evolution() {
		Cellule[][] Cellules = this.doubleCellules();
		for (int i = 0; i < Cellules.length; i++) {
			for (int j = 0; j < Cellules[i].length; j++) {
				Cellules[i][j].setStatut(nouveauStatut(i, j));
			}
		}
		this.cellules = Cellules;
	}

	public Statut verifierVoisins(int i, int j, Table table) {
		int nombreVivante = table.nombreVivante(i, j);
		if (nombreVivante == 3) {
			return Statut.VIVANTE;
		}
		if (table.ifVivante(i, j) && nombreVivante == 2) {
			return Statut.VIVANTE;
		}
		if (nombreVivante < 2 || nombreVivante > 3) {
			return Statut.MORTE;
		}
		return Statut.MORTE;

	}

	/**
	 * Verifier si la cellule est Vivante
	 *
	 */
	public boolean ifVivante(int i, int j) {
		try {
			if (cellules[i][j] != null) {
				return Statut.VIVANTE.equals(cellules[i][j].getStatut());
			}
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
		return false;

	}

	public Cellule[][] doubleCellules() {
		Cellule[][] cellule = new Cellule[cellules.length][cellules[0].length];
		for (int i = 0; i < cellule.length; i++) {
			for (int j = 0; j < cellule[i].length; j++) {
				cellule[i][j] = new Cellule(cellules[i][j].getStatut());
			}
		}
		return cellule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(cellules);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Table other = (Table) obj;
		if (!Arrays.deepEquals(cellules, other.cellules))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Table [cellules=" + Arrays.toString(cellules) + "]";
	}

}
