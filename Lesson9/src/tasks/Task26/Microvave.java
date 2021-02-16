package tasks.Task26;

/*
Задание 26
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class Microvave extends Appliances {

    public static int temperature;
    public static int gramsOfFood;
    public static int voltage;

    Microvave(int voltage, int temperature, int gramsOfFood, String type) {
        super(type);
        this.temperature = temperature;
        this.gramsOfFood = gramsOfFood;
        this.voltage= voltage;
    }

    @Override
    public void TurnOn() {
        if (voltage <= 220) {
            System.out.println("Микроволновка включилась в разетку и начала греть " + gramsOfFood + " грамм еды до температуры: " + temperature);
        } else if (voltage > 220) {
            System.out.println("Ваша квартира сгорела и вы бомж");
        }
    }
}
