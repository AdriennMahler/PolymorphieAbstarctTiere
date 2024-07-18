public class Hund extends Tier{


    public Hund(String name, int alter, boolean gesund) {
        super(name, alter, gesund);
    }
    void laufen(){
        System.out.println("Hund " + name + " läuft.");
    }
    void typUndName(){
        System.out.println("Hund. Name: " + name);
    }
}
