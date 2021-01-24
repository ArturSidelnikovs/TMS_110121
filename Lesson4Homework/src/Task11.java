/*3) Дано целое число. Если оно является положительным,
     то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
     Если нулевым, то заменить его на 10. Вывести полученное число
 */

public class Task11 {
    public static void main(String[] args) {
        int x = 104;
        if (x >= 0) {
            x++;
            System.out.println(x);
        } else if (x < 0) {
            x = x-2;
            System.out.println(x);
        } else if (x==0) {
            x=10;
            System.out.println(x);
        }
    }
}
