/*
Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */

public class Task1 {
    public static void main(String[] args) {
        double Composition = 1;
        int n = 0;
        int x = (int)(Math.random() * 5);
        while(x>0) {
            Composition *= x;
            x --;
            n++;
        }
        System.out.println("Факториал числа"+" " + n+ " "+"равен"+" "+ Composition);
    }
}
