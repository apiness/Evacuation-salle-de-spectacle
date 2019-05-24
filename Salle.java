package proj.simuagent;
import proj.physics.Vecteur2D;
import java.util.ArrayList;
/**
 * <b> Salle est la classe représentant notre salle de spectacle. </b> 
 * <p>
 *  Une Salle est caractérisée par les informations suivantes :
 *  <ul> 
 *  <li> Une matrice de Terrain terr </li>
 *  <li> Une liste de vecteur2D correspondants à la liste des coordonées des cibles potentielles (Bornes exit et Sortie) présentent dans la Salle.</li>
 *  <li> Une constante correspondant au coté d'un Terrain composant la Salle </li> 
 *  </ul>
 *  </p> 
 */
public class Salle  {
	/**
	 * Liste des coordonnées des cibles 
	 */
	private ArrayList<Vecteur2D> listeCibles;
	/**
	 * Matrice de Terrain correspondant à l'agencement de la salle.
	 */
	private Terrain[][] terr; 
	/**
	 * Constante correspondant à la taille d'un coté des Terrain composants la Salle
	 */
	public static final int cote = 10;
	
	/**
	 * Constructeur Salle
	 * <p>On remplit la liste des coordonnées des cibles en parcourant notre Matrice de Terrain. Si le Terrain est une cibles,
	 *  on ajoute ses coordonées à la liste.</p>
	 * @param t : la Matrice de Terrain 
	 *
	 */
	public Salle(Terrain[][] t) {
		terr = t;
		listeCibles= new ArrayList<Vecteur2D>();
		for (int i = 0; i < terr.length; i ++) {
			for(int j = 0; j < terr[0].length; j++) {
				if(Terrain.isTarget(terr[i][j])) {
					listeCibles.add(new Vecteur2D(i * cote , j * cote ));
					
				}
			}
		}
		
	}
	/**
	 * On ajoute v à la liste de cibles listeCibles
	 * @param v 
	 */
	public void add(Vecteur2D v) {
		listeCibles.add(v);
		
	}
	/**
	 * Retourne la liste des coordonnées des cibles 
	 * @return listeCibles 
	 */
	public ArrayList<Vecteur2D> getListeCibles(){
		return listeCibles;
		
	}
	
	/**
	 * Retourne la case (donc le Terrain) de coordonnées (i,j) de la matrice de Terrain
	 * @param i coordonée ligne i 
	 * @param j coordonnée colonne j
	 * @return terr[i][j]
	 */
	public Terrain get(int i , int j) {
		return terr[i][j];
	}
	
	
	/** 
	 * @param v le Vecteur 2D dont les coordonées sont celles du Terrain que l'on retourne
	 * @return le Terrain de coordonées (v.getX(), v.getY())
	 */
	public Terrain get(Vecteur2D v) {
		return terr[(int)(v.getX()/cote)][(int)(v.getY()/cote)];
	}
	/**
	 * 
	 * @return la hauteur de la salle 
	 */
	public int getHaut() {
		return terr.length; 
	}
	/**
	 * 
	 * @return la largeur de la salle 
	 * <p> On vérifie d'abord qu'il y a une longeur, sinon il n'y a pas de largeur </p> 
	 */
	public int getLar() {
		if(terr.length == 0) {
			return 0;
		}
		return terr[0].length;
	}
	
	/**
	 * Retourne true si source et target ne sont pas spéparées par un mur et false sinon.
	 * @param source la personne
	 * @param target la cible potentielle
	 * @return s'il y a un mur entre la personne et sa cible 
	 */
	public boolean isVisible(Vecteur2D source, Vecteur2D target){
        Vecteur2D dir = target.minus(source);
        dir.normalize();
        while(get(source) != Terrain.Mur){
            source = source.add(dir);
            if(source.distance(target) < 2)
                return true;
        }
        return false;
    }

}
