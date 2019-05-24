package proj.tests;
import proj.physics.*;
import proj.simuagent.*;

public class TestStrategyComplex {

	public static void main(String[] args) {
		Salle s =  new Salle(MapFactoryFromFile_Matrix.build("s.trk"));
		Personne p = new Personne(100, 100, new StrategySauveQuiPeut(s));
		
		System.out.println(p.getPos());
		
		p.move();
		p.updatePositionAndVitesse(); 
		System.out.println(p.getPos());
		
		p.move();
		p.updatePositionAndVitesse();
		System.out.println(p.getPos());
		
	}
}
	


