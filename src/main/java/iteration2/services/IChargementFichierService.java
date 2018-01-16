/**
 * 
 */
package iteration2.services;

import java.io.FileNotFoundException;
import iteration2.Simulateur;
import iteration2.domain.Dimension;
import iteration2.domain.Table;
import iteration2.domain.Cellule;

/**
 * @author Aabid
 *
 */
public interface IChargementFichierService {
	public Simulateur charger() throws FileNotFoundException;

	public int recupererNbrIteration(String ligne);

	public Dimension recupererDimension(String ligne);

	public Table recupererTable(String ligne);

	public Cellule[] conversionStringToCellule(String[] s);
}
