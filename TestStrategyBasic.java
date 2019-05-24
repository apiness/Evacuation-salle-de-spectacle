package proj.tests;
import proj.physics.Personne;
import proj.simuagent.StrategyBasic;

/**
 * Classe nous permettant de tester si notre classe StrategyBasic est fonctinelle 
 * soit si une Personne se d�place bien de mani�re arbitraire lorsque l'on fait appel � la m�thode move de Personne qui elle m�me fait d�placer 
 * la Personne par la Strategy adopt�e.
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
