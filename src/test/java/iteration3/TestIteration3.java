package iteration3;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import iteration3.domain.Cellule;
import iteration3.domain.Table;
import statutCellule.Statut;

public class TestIteration3 {

	private Table initiale;
	private Table resultat;

	@Before
	public void setUp() throws Exception {

		Cellule c1 = new Cellule(Statut.VIVANTE);
		Cellule c2 = new Cellule(Statut.VIVANTE);
		Cellule c3 = new Cellule(Statut.VIVANTE);
		Cellule c4 = new Cellule(Statut.VIVANTE);
		Cellule c5 = new Cellule(Statut.VIVANTE);
		Cellule c6 = new Cellule(Statut.VIVANTE);
		Cellule[] Cellules3 = { c1, c2, c3, c4, c5, c6 };

		this.initiale = new Table(Cellules3);

		Cellule cR1 = new Cellule(Statut.MORTE);
		Cellule cR2 = new Cellule(Statut.VIVANTE);
		Cellule cR3 = new Cellule(Statut.VIVANTE);
		Cellule cR4 = new Cellule(Statut.VIVANTE);
		Cellule cR5 = new Cellule(Statut.VIVANTE);
		Cellule cR6 = new Cellule(Statut.MORTE);
		Cellule[] CellulesR3 = { cR1, cR2, cR3, cR4, cR5, cR6 };
		this.resultat = new Table(CellulesR3);

	}

	@Test
	public void test_Statut_Cellule_Vivante() {
		Assertions.assertThat(Statut.VIVANTE).isEqualTo(initiale.nouveauStatut(4));
	}

	@Test
	public void test_Statut_Cellule_Morte() {
		Assertions.assertThat(Statut.MORTE).isEqualTo(initiale.nouveauStatut(5));
	}

	@Test
	public void test_Evolution_Apres_Iterattion() {
		initiale.evolution();

		Assertions.assertThat(initiale.getCellules()[0].getStatut()).isEqualTo(resultat.getCellules()[0].getStatut());
		Assertions.assertThat(initiale.getCellules()[1].getStatut()).isEqualTo(resultat.getCellules()[1].getStatut());
		Assertions.assertThat(initiale.getCellules()[2].getStatut()).isEqualTo(resultat.getCellules()[2].getStatut());
		Assertions.assertThat(initiale.getCellules()[3].getStatut()).isEqualTo(resultat.getCellules()[3].getStatut());
		Assertions.assertThat(initiale.getCellules()[4].getStatut()).isEqualTo(resultat.getCellules()[4].getStatut());
		Assertions.assertThat(initiale.getCellules()[5].getStatut()).isEqualTo(resultat.getCellules()[5].getStatut());

	}

}
