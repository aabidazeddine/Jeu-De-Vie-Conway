package iteration3.services;

import java.io.FileNotFoundException;

import iteration3.Simulateur;
import iteration3.domain.Table;
import iteration3.domain.Cellule;
import iteration3.domain.Dimension;

public interface IChargementFichierService {
	public Simulateur charger() throws FileNotFoundException;

	public int recupererNbrIteration(String ligne);

	public Dimension recupererDimension(String ligne);

	public Table recupererTable(String ligne);

	public Cellule[] conversionStringToCellule(String[] s);
}
