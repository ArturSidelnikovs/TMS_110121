/*
Найдите сумму первых n целых чисел, которые делятся на 3.
 */

public class Task4 {
    public static void main(String[] args) {
                int sum = 0;
                int chisla = 0;

                for (int i = 1; i < 50; i++) {
                    if (i % 3 == 0) {
                        System.out.println("Число " + i + " делится на 3");
                        sum += i;
                        chisla++;
                    } if (chisla== 5) {
                        System.out.println("Сумма первых "+chisla+" целых чисел делящихся на 3 равна: " + sum);
                        break;
                    }
                }
            }
        }





