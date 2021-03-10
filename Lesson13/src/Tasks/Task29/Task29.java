package Tasks.Task29;

import java.util.*;

/*
Задание 29
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Task29 {


    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        Integer b = 0;

        for (int i = 0; i <= 10; i++) {
            b = (int) ((Math.random() * 10));
            marks.add(b);
            System.out.print(marks.get(i) + " ");
        }

        System.out.println(" ");

        for (int j = 0; j < marks.size(); j++) {
            if (marks.get(j)<=4) {
                System.out.print(marks.get(j)+ " ");
                marks.remove(j);
            }
        }
    }
}










