import javax.sound.midi.Soundbank;

/*
Задание 6
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task6 {
    public static void main(String[] args) {
        int x = 23;
        if (x>=100) {
            System.out.println("x трехзначное число");
        } else {
            System.out.println("x двузначное число");
        } if (x%2==0) {
            System.out.println("x является четным числом");
        } else {
            System.out.println("x является нечетным числом");
        } if (x%10==7) {
            System.out.println("Последняя цифра числа x равняется 7");
        } else {
            System.out.println("Последняя цифра числа x не равняется 7");
        }



    }
}
