package Tasks.Task30;
import java.util.HashMap;
import java.util.Iterator;

/*
Задание 30
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
 */

public class Task30 {
    public static void main(String[] args) {


        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int a = 0; a<10 ; a++) {
            Integer b = (int)(Math.random() * 10 +2);
            hm.put(a,b);
            System.out.print(hm.get(a) + " ");
        }

        for (int i = 0; i < hm.size(); i++) {
               if (hm.get(i).equals(hm.get(i+1))) {
                   hm.remove(i+1);
               }
         }
     }
}



