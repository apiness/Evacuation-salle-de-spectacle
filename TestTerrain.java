package proj.tests;
import proj.simuagent.Terrain;
public class TestTerrain {
	public static void main(String[] args){
			
		//test de conv en fonction du char +
		char lettre = '+';
		if (Terrain.conv(lettre) == Terrain.Safe)
			System.out.println("conv(char) fonctionnel");
		
		//test de conv en fonction d'un terrain
		char s;
		s = Terrain.conv(Terrain.Mur);
		if (s == '#')
			System.out.println("conv(Terrain) fonctionnel");
			
		//test du level d'un Terrain
		if (Terrain.level(Terrain.BorneExit_6) == 6)
			System.out.println("level(Terrain) fonctionnel");
			
		//test du isTarget d'un Terrain
		if (Terrain.isTarget(Terrain.Mur) == false)
			System.out.println("isTarget(Terrain) fonctionnel");
		
		// test du display d'une matrice de Terrain
		Terrain m = Terrain.BorneExit_8;
		Terrain[][] trk = new Terrain[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++){
				trk[i][j] = m;
			}
		}
		Terrain.display(trk);
	}
}

