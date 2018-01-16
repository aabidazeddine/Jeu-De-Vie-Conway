package iteration4.services;

import java.io.FileNotFoundException;
import java.util.List;

import iteration4.Simulateur;
import iteration4.domain.Table;
import iteration4.domain.Dimension;

public interface IChargementFichierService {
	public Simulateur charger() throws FileNotFoundException;

	public int recupererNbrIteration(String ligne);

	public Dimension recupererDimension(String ligne);

	public Table recupererTable(List<String> ligne, Dimension dimension);
}
