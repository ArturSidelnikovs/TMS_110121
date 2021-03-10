package Tasks.task31;

/*
Задание 31
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task31 {
    public static void main(String[] args) {


        List<Integer> marks = new ArrayList<>(10);

        for (int i = 0; i < 15; i++) {
            Integer b = (int)(Math.random() * 10);
            marks.add(i,b);
        }

        Iterator iterator = marks.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println(" ");
        System.out.println("Максимальное значение: " + Collections.max(marks));



    }
}


