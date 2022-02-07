public class TestBelote {
    public static void main(String[] args) {
        Belote b=new Belote();
        System.out.println("Les Joueurs:");
        for(int i=0;i<b.getJoueurs().length;i++){
            System.out.println(b.getJoueurs()[i].getName());
        }
        System.out.println("Les Cartes:");
        for(int i=0;i<52;i++){
            System.out.println(b.getCartes()[i].printOut());
        }
    }
    
}
