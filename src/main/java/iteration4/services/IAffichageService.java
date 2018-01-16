package iteration4.services;

import iteration4.domain.Cellule;
import iteration4.domain.Table;
import iteration4.domain.Dimension;
import statutCellule.Statut;

public interface IAffichageService {
	public String recupererCellule(Statut statut);

	public void afficherDansConsole(int nbrIteration, Table table, Dimension dimension);

	public String ligne(Cellule[] cellules);
}
