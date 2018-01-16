package iteration1.services;

import iteration1.domain.Table;
import statutCellule.Statut;

public interface IAffichageService {

	public void afficherDansConsole(int nbrIteration, Table table);

	public void afficherCellule(Statut statut);

}