package iteration6.services;

import java.io.FileNotFoundException;
import java.util.List;

import iteration6.Simulateur;
import iteration6.domain.Dimension;
import iteration6.domain.Table;

public interface IChargementFichierService {
	public Simulateur charger() throws FileNotFoundException;

	public int recupererNbrIteration(String ligne);

	public Dimension recupererDimension(String ligne);

	public Table recupererTable(List<String> ligne, Dimension dimension);
}
