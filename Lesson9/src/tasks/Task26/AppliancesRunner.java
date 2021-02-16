package tasks.Task26;

public class AppliancesRunner {
    public static void main(String ... args) {

        Microvave microvave = new Microvave(240,300, 300,"Кухонная техника");
        Washer washer = new Washer("Техника для стирки", 220, 10, 30);
        Appliances appliances = new Appliances("Вся бытовая техника");


        appliances.TurnOn();
        microvave.TurnOn();
        washer.TurnOn();




    }
}
