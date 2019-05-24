package proj.tests;
import proj.simuagent.Salle;
import proj.simuagent.Terrain;
import proj.simuagent.MapFactoryFromFile_Matrix;
/**
  Classe nous permettant de tester si notre classe Salle et MapFactoryFromFile_Matrix sont fonctionnelles.
 */
public class TestSalle {

	public static void main(String[]args ) {
		
		Terrain[][] t = MapFactoryFromFile_Matrix.build("s.trk");
		Terrain.display(t);
		
		Salle s = new Salle(t);
		
		System.out.println("hauteur : " + s.getHaut());
		System.out.println("largeur : " + s.getLar());
		System.out.println("taille de listeCibles: " + s.getListeCibles().size());
		
		System.out.println(s.get(0, 0));
		System.out.println(s.getListeCibles());
		
		
	}

}
