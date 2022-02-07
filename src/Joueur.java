public class Joueur {
    private String name;
    private int score;
    private static int compteur;
    private Carte[] carteTab;

    public Joueur(String name) {
        this.name = name;
        this.score=0;
        compteur=0;
        this.carteTab=new Carte[13];
    }

    public void ajoutCarte(Carte carte){
        for(Carte c:carteTab){
            if(c==null){
                c=carte;
                compteur++;
            }
            break;
        }
    }
    
    public Carte jouerEnPremier(){
        for(Carte c:carteTab){
            if(c!=null){
                Carte ech;
                ech=new Carte(c);
                c=null;
                compteur--;
                return ech;
            }
        }
        return null;
    } 
    
    public void play(int signe){

    }

    
    

}
