package proj.simuagent;

// déclaration enum
public enum Terrain {
    // liste des constantes possible comme valeur de Terrain 
Mur, Scene, Vide, Safe, 
BorneExit_9, BorneExit_8, BorneExit_7, BorneExit_6, BorneExit_5, 
BorneExit_4, BorneExit_3, BorneExit_2, BorneExit_1;
  
    // tableau de conversion des caractères vers les Terrain
    private final static String conversion = "#. +987654321";
    // niveau de sécurité de chaque terrain: les personnes seront attirées par les niveaux les plus faibles
    private final static int[] securitylevel = {12,10,10,0,9,8,7,6,5,4,3,2,1};
    
    // méthodes static de conversion et de calcul du niveau de sécurité
    public static Terrain conv(char c){
        int ind = Terrain.conversion.indexOf((int) c);		// indice de la premiere occurence de c dans conversion 
        if(ind ==-1)
            throw new RuntimeException("Terrain inconnu");
        return Terrain.values()[ind]; //si on entre "8", on retourne borne8
    }
    public static char conv(Terrain t){
        return conversion.charAt(t.ordinal()); //Si je rentre terrain Borne8, il retourne "8";
    }
    public static int level(Terrain t){ // si je rentre terrain Borne8 retourne 8 en int 
        return securitylevel[t.ordinal()];
    }
    // identification des terrains qui attirent les personnes
    public static boolean isTarget(Terrain t) {  // est une cible potentielle ?
        return !(t==Mur || t == Scene || t== Vide);
    }
    // fonction de controle
    public static void display(Terrain[][] trk){   //affiche le niveau de securite de chaque terrain sur la matrice de terrains.
        for(int i=0; i<trk.length; i++){ 
            for(int j=0; j<trk[0].length; j++)
                System.out.print(conv(trk[i][j]));
            System.out.println();
        }
    }
}
