public class Belote {
    private static Carte[] cartes;
    private static Joueur[] joueurs;

    public Belote(){
        String[] names={"Doudou","Lamine","Fatou","Dieynaba"};
        joueurs=new Joueur[4];
        cartes=new Carte[52];
        for(int i=0;i<4;i++){
            joueurs[i]=new Joueur(names[i]);
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<13;j++){
                String name;
                switch(j){
                    case 10:
                        name="roi";
                        break;
                    case 11:
                        name="dame";
                        break;
                    case 12:
                        name="valet";
                        break;
                    default:
                        name=Integer.toString(j);
                        
                }   

                try {
                    cartes[j+(13*i)]=new Carte(i,name,j);
                } catch (InputException e) {
                    e.getMessage();
                }
            }
        }

        //distribution de cartes
        
    }

    public static Carte[] getCartes() {
        return cartes;
    }

    public static void setCartes(Carte[] cartes) {
        Belote.cartes = cartes;
    }

    public static Joueur[] getJoueurs() {
        return joueurs;
    }

    public static void setJoueurs(Joueur[] joueurs) {
        Belote.joueurs = joueurs;
    }

}
