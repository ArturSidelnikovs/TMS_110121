public class Task9 {
    /*
    1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
    и положительное оно или отрицательное. Например, "это однозначное положительное число".
    Достаточно будет определить, является ли число однозначным, "двузначным или трехзначным и более
     */
    public static void main(String[] args) {
        int x = 11;
        if (x >= 10 && x>=0) {
            System.out.println(x + " " + " двузначное положительное число");
        } else {
            System.out.println(x + " " + "X однозначное отрицательное число");
        }
    }
}
