package iteration6;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import iteration6.domain.Cellule;
import iteration6.domain.Table;
import statutCellule.Statut;

public class TestIteration6 {

	public TestIteration6() {
		// TODO Auto-generated constructor stub
	}

	private Table initiale;
	private Table evolution1;
	private Table evolution2;

	@Before
	public void setUp() throws Exception {
		// source
		Cellule c1 = new Cellule(Statut.VIVANTE);
		Cellule c2 = new Cellule(Statut.MORTE);

		Cellule[][] celluleAvant = { { c2, c2, c2, c2, c2, c2, c2 }, { c2, c2, c2, c2, c2, c2, c2 },
				{ c2, c2, c2, c2, c2, c2, c2 }, { c1, c1, c1, c1, c1, c1, c1 }, { c2, c2, c2, c2, c2, c2, c2 },
				{ c2, c2, c2, c2, c2, c2, c2 }, { c2, c2, c2, c2, c2, c2, c2 } };
		this.initiale = new Table(celluleAvant);
		Cellule[][] evolution1 = { 
				{ c2, c2, c2, c2, c2, c2, c2 },
				{ c2, c2, c2, c2, c2, c2, c2 },
				{ c2, c1, c1, c1, c1, c1, c2 }, { c2, c1, c1, c1, c1, c1, c2 }, { c2, c1, c1, c1, c1, c1, c2 },
				{ c2, c2, c2, c2, c2, c2, c2 }, { c2, c2, c2, c2, c2, c2, c2 } };

		this.evolution1 = new Table(evolution1);
		Cellule[][] evolution2 = { { c2, c2, c2, c2, c2, c2, c2 }, { c2, c2, c1, c1, c1, c2, c2 },
				{ c2, c1, c2, c2, c2, c1, c2 }, { c1, c2, c2, c2, c2, c2, c1 }, { c2, c1, c2, c2, c2, c1, c2 },
				{ c2, c2, c1, c1, c1, c2, c2 }, { c2, c2, c2, c2, c2, c2, c2 } };

		this.evolution2 = new Table(evolution2);

	}

	@Test
	public void test_Evolution_Apres_Iterattion() {
		initiale.evolution();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				Assertions.assertThat(initiale.getCellules()[i][j].getStatut())
						.isEqualTo(evolution1.getCellules()[i][j].getStatut());
			}
		}
		evolution1.evolution();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				Assertions.assertThat(evolution1.getCellules()[i][j].getStatut())
						.isEqualTo(evolution2.getCellules()[i][j].getStatut());
			}
		}
	}
}
