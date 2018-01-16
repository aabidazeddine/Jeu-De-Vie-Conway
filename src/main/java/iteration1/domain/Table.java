package iteration1.domain;

/**
 * @author Aabid
 *
 */
import statutCellule.Statut;

public class Table {

	private Cellule cellule;

	public Table(Cellule cellule) {
		super();
		this.cellule = cellule;
	}

	public Cellule getCellule() {
		return cellule;
	}

	public void setCellule(Cellule cellule) {
		this.cellule = cellule;
	}

	public Table() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cellule == null) ? 0 : cellule.hashCode());
		return result;
	}

	public Statut nouveauStatut() {
		return Statut.MORTE;
	}

	/**
	 * Evolution
	 *
	 */
	public void evolution() {
		this.cellule.setStatut(nouveauStatut());
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
		if (cellule == null) {
			if (other.cellule != null)
				return false;
		} else if (!cellule.equals(other.cellule))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Table [cellule=" + cellule + "]";
	}

}
