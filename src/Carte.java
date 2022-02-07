public class Carte{
    private int signe;
    private String name;
    private int value;
    public Carte(int signe, String name, int value) throws InputException {
        if(signe!=0 & signe !=1 & signe !=2 & signe !=3 & signe !=4) throw new InputException("Error Signe");
        else this.signe = signe;
        this.name = name;
        this.value = value;
    }
    public Carte(Carte c){
        this.signe=c.signe;
        this.name=c.name;
        this.value=c.value;
    }

    public String printOut(){
        String res;
        switch(this.signe){
            case 0:
                res="treffle";
                break;
            case 1:
                res="pique";
                break;
            case 2:
                res="coeur";
                break;
            case 3:
                res="carreau";
                break;
            default:
                res="";
        }
        return "name: "+this.name+"\n"+"signe: "+res+"\n"+"valeur: "+this.value;
    }
    public int getSigne() {
        return signe;
    }
    public void setSigne(int signe) {
        this.signe = signe;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    


}