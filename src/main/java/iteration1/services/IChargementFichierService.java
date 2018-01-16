/**
 * 
 */
package iteration1.services;

import iteration1.Simulateur;
import iteration1.domain.Table;

/**
 * @author Aabid
 *
 */
public interface IChargementFichierService {
	public Simulateur charger();

	public int recupererNbrIteration(String ligne);

	public int recupererDimension(String ligne);

	public Table recupererTable(String ligne);
}
