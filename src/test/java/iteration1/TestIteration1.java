package iteration1;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import iteration1.domain.Cellule;
import iteration1.domain.Table;
import statutCellule.*;;

public class TestIteration1 {

	Table tableVie;
	Table tableMorte;
	Table tableMorteTest;

	@Before
	public void setUp() throws Exception {

		Cellule celluleVivante = new Cellule(Statut.VIVANTE);
		Cellule celluleMorte = new Cellule(Statut.MORTE);
		tableVie = new Table(celluleVivante);
		tableMorte = new Table(celluleMorte);
		Cellule celluleResultat = new Cellule(Statut.MORTE);
		tableMorteTest = new Table(celluleResultat);

	}

	@Test
	public void test_Statut_Cellule_Vivante() {
		Assertions.assertThat(Statut.MORTE).isEqualTo(tableVie.nouveauStatut());

	}

	@Test
	public void test_Statut_Cellule_Morte() {
		Assertions.assertThat(Statut.MORTE).isEqualTo(tableMorte.nouveauStatut());
	}

	// Test de l'etat de la Celulle apres l'evolution (ETAT IINITIALE = Cellule
	// Vivante)
	@Test
	public void test_Evolution_table_Iteration1() {
		tableVie.evolution();
		Assertions.assertThat(tableMorteTest.getCellule().getStatut()).isEqualTo(tableVie.getCellule().getStatut());
	}
	// Test de l'etat de la Celulle apres l'evolution (ETAT IINITIALE = Cellule
	// Morte)

	@Test
	public void test_Evolution2_table_Iteration1() {
		tableVie.evolution();
		Assertions.assertThat(tableMorteTest.getCellule().getStatut()).isEqualTo(tableMorte.getCellule().getStatut());
	}

}
