package iteration3.services;

import iteration3.domain.Cellule;
import iteration3.domain.Table;
import statutCellule.Statut;

public interface IAffichageService {
	public String recupererCellule(Statut statut);

	public void afficherDansConsole(int nbrIteration, Table table);

	public String ligne(Cellule[] cellules);
}
