package Tasks.Task32;

/*
Задание 32
Имеется текст. Следует составить для него частотный словарь.
 */

import java.util.HashMap;
import java.util.StringTokenizer;

public class Task32 {
    public static void main(String[] args) {

        String text = "Существуют две основные трактовки понятия «текст»: имманентная " +
                "(расширенная, философски нагруженная) и репрезентативная (более частная)." +
                " Имманентный подход подразумевает отношение к тексту как к автономной реальности," +
                " нацеленность на выявление его внутренней структуры. Репрезентативный — рассмотрение " +
                "текста как особой формы представления информации о внешней тексту действительности.";


        HashMap<String,Integer> someText = new HashMap<>();

        StringTokenizer words = new StringTokenizer(text, " -,.;:()!");

        while  (words.hasMoreTokens()) {
            String word = words.nextToken();
            if (someText.containsKey(word)) {
                int tempValue = someText.get(word);
                someText.put(word, ++tempValue);
            } else {
                someText.put(word, 1);
            }
        }
        System.out.println(someText);

    }
}

