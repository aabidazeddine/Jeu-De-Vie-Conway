package iteration5.services;

import java.io.FileNotFoundException;
import java.util.List;

import iteration5.Simulateur;
import iteration5.domain.Table;
import iteration5.domain.Dimension;

public interface IChargementFichierService {
	public Simulateur charger() throws FileNotFoundException;

	public int recupererNbrIteration(String ligne);

	public Dimension recupererDimension(String lines);

	public Table recupererTable(List<String> ligne, Dimension dimension);
}
