package iteration2;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import iteration2.domain.Cellule;
import iteration2.domain.Table;
import statutCellule.Statut;

public class TestIteration2 {

	private Table initiale;
	private Table resultat;

	@Before
	public void setUp() throws Exception {

		Cellule c1 = new Cellule(Statut.VIVANTE);
		Cellule c2 = new Cellule(Statut.VIVANTE);

		Cellule[] Cellules3 = { c1, c2 };

		this.initiale = new Table(Cellules3);

		Cellule cR1 = new Cellule(Statut.MORTE);
		Cellule cR2 = new Cellule(Statut.MORTE);
		Cellule[] CellulesR3 = { cR1, cR2 };
		this.resultat = new Table(CellulesR3);

	}

	@Test
	public void test_Evolution_Apres_Iterattion() {
		initiale.evolution();

		Assertions.assertThat(initiale.getCellules()[0].getStatut()).isEqualTo(resultat.getCellules()[0].getStatut());
		Assertions.assertThat(initiale.getCellules()[1].getStatut()).isEqualTo(resultat.getCellules()[1].getStatut());

	}

}
