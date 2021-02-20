package tasks.InterfaceTask28;

public class HumanRunner extends Human {

    HumanRunner(String name, String jacket, String pants, String shoes) {
        super(name, jacket, pants, shoes);
    }


    public static void main(String[] args) {
        Human human = new Human("Леха Навальный", "Gucci куртку","Gucci джинсы","Мокрые кроссы");


        human.PutOnHuman();
        System.out.println();
        human.TakeOffHuman();

    }
}
