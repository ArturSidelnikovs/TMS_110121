/*
Задание 14
Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.
 */

public class Task14 {
    public static void main(String[] args) {
        int rating [] = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        int tmp;
        for (int start = 0; start < rating.length - 1; start++) {
            for (int index = 0; index < rating.length - 1 - start; index++) {
                if (rating [index] > rating [index + 1]) {

                }
                tmp = rating [index];
                rating [index] = rating [(index + 1)];
                rating [(index + 1)] = tmp;
            }
        }
        System.out.println(rating [rating.length-1] + " " + rating [0]);
    }
}

