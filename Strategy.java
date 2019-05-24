package proj.simuagent;
import proj.physics.Personne;
import proj.physics.Vecteur2D;
/**
 *<ul> L'interface Strategy représente le "contrat" pour la création des classes concrètes l'implémentant .</ul>
 *Elle impose la redéfinition d'une méthode deplacement(Personne p).
 */
public interface Strategy {
	/**
	 * Cette méthdode indique comment la personnne va se deplacer.
	 * @param p La personne qui va se déplacer.
	 * @return la cible vers laquelle va se diriger la personne
	 */
	public Vecteur2D deplacement(Personne p);
}
