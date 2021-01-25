/*
4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

public class Task14 {
    public static void main(String[] args) {
        int x = 5, t = 2, j = 3;
        if (x >= 0) {
            if (t >= 0) {
                if (j >= 0) {
                    System.out.println(j + " " + "положительное число");
                }
                    System.out.println(t + " " + "положительное число");
                }
                System.out.println(x + " " + "положительное число");
            }

            if (x >= 0 & t >= 0 & j >= 0) {
                System.out.println("Все 3 числа положительные");
            } else if (x >= 0 & t >= 0 & j < 0) {
                System.out.println(x + " " + t + " " + "2 числа из 3 положительные");
            } else if (t >= 0 & j >= 0 & x < 0) {
                System.out.println(j + " " + t + " " + "2 числа из 3 положительные");
            } else if (x >= 0 & j >= 0 & t < 0) {
                System.out.println(j + " " + x + " " + "2 числа из 3 положительные");


            }
        }
    }


