package iteration6.services;

import iteration6.domain.Cellule;
import iteration6.domain.Dimension;
import iteration6.domain.Table;
import statutCellule.Statut;

public interface IAffichageService {
	public String recupererCellule(Statut statut);

	public void afficherDansConsole(int nbrIteration, Table table, Dimension dimension);

	public String ligne(Cellule[] cellules);
}
