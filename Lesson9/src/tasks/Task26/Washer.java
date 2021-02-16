package tasks.Task26;

/*
Задание 26
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class Washer extends Appliances {

    public static String drum;
    public static int voltage;
    public static int kilo;
    public static int time;



    public Washer (String type, int voltage, int kilo, int time) {
        super(type);
        this.voltage = voltage;
        this.kilo = kilo;

    }

    @Override
    public void TurnOn() {
            if (voltage <= 220) {
                System.out.println("Стиральная машина в сети! Вы загрузили " + kilo + " киллограмм одежды, на " + time +" минут");
            } else if (voltage > 220) {
                System.out.println("Ваша квартира сгорела и вы бомж");
            }
    }

}

