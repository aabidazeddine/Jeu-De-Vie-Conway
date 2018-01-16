package iteration2.services;

import iteration2.domain.Table;
import iteration2.domain.Cellule;
import statutCellule.Statut;

public interface IAffichageService {
	public String recupererCellule(Statut statut);

	public void afficherDansConsole(int nbrIteration, Table table);

	public String ligne(Cellule[] cellules);

}