/**
 * 
 */
package demo;

import java.io.FileNotFoundException;
import demo.Demo;

/**
 * @author Aabid Classe pour Afficher le resultat dans la Console pour chaque
 *         Iteration 1....5
 */
public class Demo {
	/**
	 * 
	 */
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Classe pour Afficher le resultat dans la Console pour Iteration 1
	 * Dimension 1x1
	 */
	public void iteration1() throws FileNotFoundException {
		System.out.println("\n");
		System.out.println("########   Dimension 1x1 avec 3 Evolution (iteration1)  ########   " + "\n");
		iteration1.Simulateur simulator = new iteration1.services.ChargementFichierService().charger();
		simulator.setAffichage(new iteration1.services.AffichageService());
		simulator.go();
	}

	/**
	 * Classe pour Afficher le resultat dans la Console pour Iteration 2
	 * Dimension 1x2
	 */
	public void iteration2() throws FileNotFoundException {
		System.out.println("\n");
		System.out.println("########   Dimension 1x2 avec 3 Evolution (iteration2)  ########   " + "\n");
		iteration2.Simulateur simulator = new iteration2.services.ChargementFichierService().charger();
		simulator.setAffichage(new iteration2.services.AffichageService());
		simulator.go();
	}

	/**
	 * Classe pour Afficher le resultat dans la Console pour Iteration 3
	 * Dimension 1x6
	 */
	public void iteration3() throws FileNotFoundException {
		System.out.println("\n");
		System.out.println("########   Dimension 1x8 avec 3 Evolution (iteration3)  ########   " + "\n");
		iteration3.Simulateur simulator = new iteration3.services.ChargementFichierService().charger();
		simulator.setAffichage(new iteration3.services.AffichageService());
		simulator.go();
	}

	/**
	 * Classe pour Afficher le resultat dans la Console pour Iteration 4
	 * Dimension 4x4
	 */
	public void iteration4() throws FileNotFoundException {
		System.out.println("\n");
		System.out.println("########   Dimension 3x3 avec 5 Evolution (iteration4)  ########   " + "\n");
		iteration4.Simulateur simulator = new iteration4.services.ChargementFichierService().charger();
		simulator.setAffichage(new iteration4.services.AffichageService());
		simulator.go();
	}

	/**
	 * Classe pour Afficher le resultat dans la Console pour Iteration 5
	 * Dimension 5x1
	 */
	public void iteration5() throws FileNotFoundException {
		System.out.println("\n");
		System.out.println("########   Dimension 6x1 avec 3 Evolution (iteration5)  ########   " + "\n");
		iteration5.Simulateur simulator = new iteration5.services.ChargementFichierService().charger();
		simulator.setAffichage(new iteration5.services.AffichageService());
		simulator.go();
	}

	/**
	 * Classe pour Afficher le resultat dans la Console pour Iteration 4
	 * Dimension 4x4
	 */
	public void iteration6() throws FileNotFoundException {
		System.out.println("\n");
		System.out.println("########   Dimension 7x7 avec 10 Evolution (iteration6)  ########   " + "\n");
		iteration6.Simulateur simulator = new iteration6.services.ChargementFichierService().charger();
		simulator.setAffichage(new iteration6.services.AffichageService());
		simulator.go();
	}

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new Demo().iteration1();
		new Demo().iteration2();
		new Demo().iteration3();
		new Demo().iteration4();
		new Demo().iteration5();
		new Demo().iteration6();
	}

}
