package proj.tests;
import proj.simuagent.*;
import proj.physics.*;
import java.util.Collections;


/**
 * Classe nous permettant de tester si notre comparateur de position est fonctionnel
 */
public class TestComparateurPosition {

	public static void main(String[] args) {
		
		Personne p = new Personne(100, 100, new StrategyBasic());
		Salle s =  new Salle(MapFactoryFromFile_Matrix.build("C:/s.trk"));
		
		Vecteur2D best = Collections.min(s.getListeCibles(), new ComparateurPosition(s, p.getPos()));
		System.out.println(best);
		System.out.println(s.get(best));
	
		
	}

}
