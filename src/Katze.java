public class Katze extends Tier{

    public Katze(String name, int alter, boolean gesund) {
        super(name, alter, gesund);
    }
    void laufen(){
        System.out.println("Katze " + name + " läuft.");
    }
    void typUndName(){
        System.out.println("Katze. Name: " + name);
    }
}
