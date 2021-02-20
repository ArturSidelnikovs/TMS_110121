package tasks.InterfaceTask28;

public class Human implements Pants, Jacket, Shoes{

    public static String name;
    public static String jacket;
    public static String pants;
    public static String shoes;


    Human (String name, String jacket, String pants, String shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public  void PutOnHuman () {
        PutOnJacket ();
        PutOnPants ();
        PutOnShoes();
    }

    public  void TakeOffHuman () {
        TakeOffJacket ();
        TakeOffPants ();
        TakeOffShoes();
    }


    @Override
    public void PutOnJacket() {System.out.println(name + " Напер на себя " + jacket);}

    @Override
    public void TakeOffJacket() {System.out.println(name + " Cнял с себя " + jacket);}

    @Override
    public void PutOnPants() {System.out.println(name + " Напер на себя " + pants); }

    @Override
    public void TakeOffPants() {System.out.println(name + " Cнял с себя " + pants);}

    @Override
    public void PutOnShoes() {System.out.println(name + " Напер на себя " + shoes);}

    @Override
    public void TakeOffShoes() {System.out.println(name + " Cнял с себя " + shoes);}

   public static void asf () {
       System.out.println();

   }
}
