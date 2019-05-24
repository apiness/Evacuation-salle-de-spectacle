package proj.simuagent;
import proj.physics.Vecteur2D;
import proj.physics.Personne;
import proj.simuagent.Strategy;

/**
 * Cette classe implémente Strategy  a pour objectif de déplacer la personne dans une direction arbitraire.
 */
public class StrategyBasic implements Strategy {
	public StrategyBasic() {
	
	}
	
	@Override
	public Vecteur2D deplacement(Personne p) {
		Vecteur2D v = new Vecteur2D(9,9);
	
		return v;
	}

}
