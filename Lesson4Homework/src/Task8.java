import java.util.Random;

public class Task8 {
    /*
    Задание 8
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1000);
        if (x%10==1 | x==1) {
            System.out.println(x + " " + "рубль");
        } else if (x%10==2 | x%10==4 | x%10==3) {
            System.out.println(x +" " + "рубля");
            } else if (x>=5) {
            System.out.println(x +" " + "рублей");
        }

    }
}

