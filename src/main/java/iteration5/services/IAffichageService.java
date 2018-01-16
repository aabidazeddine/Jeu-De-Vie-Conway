package iteration5.services;

import iteration5.domain.Cellule;
import iteration5.domain.Table;
import statutCellule.Statut;

public interface IAffichageService {
	public String recupererCellule(Statut statut);

	public void afficherDansConsole(int nbrIteration, Table table);

	public void ligne(Cellule[] cellules);
}
