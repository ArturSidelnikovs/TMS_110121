import java.util.Random;

public class Task2 {
    /*
Задание 10
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
        public static void main(String[] args) {
            int Composition = 1;
            int n = (int) (Math.random() * (15 - 10) + 10);
                for (int i = 1; i<=n; i ++) {
                    Composition *= i;
                }
            System.out.println("Факториал числа"+" " + n+ " "+"равен"+" "+ Composition);
        }
    }

