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

    public Carte play(int signe){
        for(Carte c:carteTab){
            if(c.getSigne()==signe){
                Carte ech;
                ech=new Carte(c);
                c=null;
                compteur--;
                return ech;
            }
        }
        return jouerEnPremier();        
    }

    public void tourGagnant(Carte[] carte){
        for(int i=0;i<carte.length;i++){
            this.score+=carte[i].getValue();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Joueur.compteur = compteur;
    }

    public Carte[] getCarteTab() {
        return carteTab;
    }

    public void setCarteTab(Carte[] carteTab) {
        this.carteTab = carteTab;
    }

    



    
    

}
