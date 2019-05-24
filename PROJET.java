package proj.tests;
import proj.ihm.VueTerrain;
import proj.ihm.PersonneView;
import proj.ihm.Fenetre;

import proj.physics.Personne;
import proj.physics.MoteurPhysique;
import proj.simuagent.Salle;
import proj.simuagent.MapFactoryFromFile_Matrix;
import proj.simuagent.Terrain;
import proj.simuagent.StrategySauveQuiPeut;

import java.awt.Color;

/**
 * <b> PROJET la classe ou se trouve notre main final.</b>
 * 
 *<ul> Celui ci nous permettra de visualiser et simuler l'évacuation de notre salle de spectacle.</ul> 
 */
public class PROJET {
	/**
	 * Méthode Main affichant notre Salle, les Terrains et les Personnes et permettant la simulation de l'évacuation de la Salle par 
	 * les personnes 
	 * @param args
	 * @throws InterruptedException <ul> en raison du Thread.sleep , on prend en main l'exception InterruptedException </ul> 
	 */
	public static void main(String[]args)  throws InterruptedException {
		
		Salle s = new Salle(MapFactoryFromFile_Matrix.build("s.trk"));
		
		MoteurPhysique mphys = new MoteurPhysique();
		
		Fenetre mgraph = new Fenetre();
		
	
		//On parcourt notre Salle
		for(int i = 0; i < s.getHaut(); i++) {
			for (int j = 0; j < s.getLar(); j++ ) {
				Terrain t = s.get(i, j);
				Color c = Color.WHITE;
				if( t == Terrain.Mur ){  //détermination du type de Terrain et affectation de la couleur 
					c = Color.BLACK;
				
					
				}
				else if(s.get(i,j)==Terrain.Safe) c = Color.GREEN;
				
				
				else if ( Terrain.isTarget(t)) {
					c = Color.MAGENTA;
				}
				
				
				
				
				mgraph.add(new VueTerrain(i * Salle.cote, j* Salle.cote, Salle.cote, Salle.cote, c));
				//ajout de la "vue" à la fenêtre graphique
				
				
			}
		}
		
		
		//génération des personnes par une boucle for
		for(int i = 0; i < 250; i++) {
			int x = 0;
			int y = 0;
			while(s.get(x, y) != Terrain.Vide && s.get(x, y) != Terrain.Scene) { // coordonées aléatoires 
				//On vérifie que les coordonées ne correspondent pas à un mur ou une borne exit
			 x = (int)(Math.random()*s.getHaut()-1);
			 y = (int)(Math.random() * s.getLar()-1);
			}
			
			
			Personne p = new Personne(x * Salle.cote, y*Salle.cote, 5, 50, new StrategySauveQuiPeut(s));
		
			mphys.add(p); //ajout des personnes au moteur physique 
			mgraph.add(new PersonneView(p)); //ajout de la vuePersonne à la fenêtre graphique 
			
			
		}
		
		mgraph.repaint();
		
		// boucle de mouvement + affichage
        for(int iter = 0; iter<450; iter++) {
            // mouvements
        	mphys.updateMovablePosition();
            // affichage  
            mgraph.repaint();     
            try {
			Thread.sleep(50); //temporisation (sinon, on ne voit rien)
			
            }catch (InterruptedException e) { //Prise en main de l'exception 
            	Thread.currentThread().interrupt();
            	System.out.println("La temporisation n'a pas pu s'effectuer");
            }
	        if(!mphys.isMove()) {
	        	System.out.println("plus de mouvement => sortie");
	            break;
	        }
	        
	       // Attention, le programme ne s'arrête pas, il faut fermer la fenÃªtre
        }
	    
	   
	}
}

