package proj.tests;
import proj.physics.Personne;
import proj.simuagent.StrategyBasic;

/**
 * Classe nous permettant de tester si notre classe StrategyBasic est fonctinelle 
 * soit si une Personne se déplace bien de manière arbitraire lorsque l'on fait appel à la méthode move de Personne qui elle même fait déplacer 
 * la Personne par la Strategy adoptée.
 */
public class TestStrategyBasic {

	public static void main(String[] args) {
		Personne p = new Personne(100, 100, new StrategyBasic());
		p.move();
		System.out.println(p.getPos());

		
		p.updatePositionAndVitesse(); 
		
		System.out.println(p.getPos());
		
		
	}

}
