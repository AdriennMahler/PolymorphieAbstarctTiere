public class Test {

   static void print(Tier t){
      t.typUndName();
    }
    public static void main(String[] args) {

       Tier t;

      t= new Hund("Rex", 2, true);
      t=new Katze("Tom", 3, false);

        print(t);
    }
}
