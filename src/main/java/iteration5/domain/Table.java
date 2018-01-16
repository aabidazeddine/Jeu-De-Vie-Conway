package iteration5.domain;

/**
 * @author Aabid
 *
 */
import java.util.Arrays;

import iteration5.domain.Cellule;
import statutCellule.Statut;

public class Table {

	Cellule[] cellules;

	public Cellule[] getCellules() {
		return cellules;
	}

	public void setCellules(Cellule[] cellules) {
		this.cellules = cellules;
	}

	public Table(Cellule[] cellules) {
		super();
		this.cellules = cellules;
	}

	public Statut nouveauStatut(int i) {
		return verifierVoisins(i, this);
	}

	/**
	 * Evolution
	 *
	 */
	public void evolution() {
		Cellule[] tempCells = this.doubleCellules();
		for (int i = 1; i < tempCells.length; i++) {
			tempCells[i].setStatut(nouveauStatut(i));
		}
		this.cellules = tempCells;
	}

	/**
	 * Verifier si la cellule est Vivante
	 *
	 */
	public boolean ifVivante(int i) {
		try {
			if (cellules[i] != null) {
				return Statut.VIVANTE.equals(cellules[i].getStatut());
			}
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
		return false;

	}

	public Statut verifierVoisins(int index, Table table) {
		if (index != 0) {
			if (table.ifVivante(index - 1) && table.ifVivante(index) && table.ifVivante(index + 1)) {
				return Statut.VIVANTE;
			}
		}
		return Statut.MORTE;

	}

	public Cellule[] doubleCellules() {
		Cellule[] cellule = new Cellule[cellules.length];
		for (int i = 1; i < cellule.length; i++) {
			cellule[i] = new Cellule(cellules[i].getStatut());
		}
		return cellule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cellules);
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
		if (!Arrays.equals(cellules, other.cellules))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Table [cellules=" + Arrays.toString(cellules) + "]";
	}

}
