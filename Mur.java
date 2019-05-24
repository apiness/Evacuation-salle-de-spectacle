package proj.physics;
/**
 * Cette classe Mur représente les murs de la Salle. Elle étend la classe RectanglePhysique
 */
public class Mur extends RectanglePhysique{
	/**
	 * Constructeur de Mur
	 * @param x coordonée x
	 * @param y coordonée y 
	 * @param larg largeur 
	 * @param haut hauteur 
	 */
    public Mur(double x, double y, double larg, double haut) {
        super(x, y, larg, haut); //On fait appel au constructeur de la super class RectanglePhysique 
    }   
}
