public class CarteTest {
    public static void main(String[] args) {
        try {
            Carte c=new Carte(0,"roi",13);
            System.out.println(c.printOut());
        } catch (InputException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
