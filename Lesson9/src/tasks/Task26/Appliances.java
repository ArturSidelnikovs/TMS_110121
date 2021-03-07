package tasks.Task26;
/*
Задание 26
Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */


public class Appliances {
     public static boolean turning = true;
     public static String type;

     Appliances (String type) {
         this.type =type;
     }

    public void TurnOn() {
        if (turning) {
            System.out.println("Техника включена в розетку");
        } else {
            System.out.println("Техника в розетку не включена");
        }
    }
}

