package proj.simuagent;
import proj.physics.Vecteur2D;
import proj.physics.Personne;
import proj.simuagent.Strategy;

import java.util.Collections;

/**
 * StrategySauveQuiPeut est la classe représentant une Strategy qu'est susceptible d'adopter une Personne 
 */
public class StrategySauveQuiPeut implements Strategy {
	/**
	 * La Salle dans laquelle se trouveront les Personne
	 */
	private Salle s;
	/**
	 * Constructeur de la Strategy SauveQuiPeut
	 * @param salle
	 */
	public StrategySauveQuiPeut(Salle salle) {
		s = salle;
	}
	
	@Override
	/**
	 * Cette méthode retourne les coordonées de la meilleure cible (de plus bas score) de la listeCibles.
	 *  <ul>La personne se dirigera alors vers cette dernière </ul>
	 */
	public Vecteur2D deplacement(Personne p) {
		Vecteur2D best = Collections.min(s.getListeCibles(), new ComparateurPosition(s, p.getPos()));
		return best;
		
		
	}

}
