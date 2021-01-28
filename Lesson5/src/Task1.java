/*
Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */

public class Task1 {
    public static void main(String[] args) {
        double Composition = 1;
        int x = (int)(Math.random() * 5);
        for (int i = 1; i <=x; i ++) {
            if (x==0) {
                continue;
            }
            Composition *= i;
        }

        System.out.println("Факториал числа"+" " + x+ " "+"равен"+" "+ Composition);
    }
}
