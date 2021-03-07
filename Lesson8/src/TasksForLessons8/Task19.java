package TasksForLessons8;

import java.util.StringTokenizer;

/*
Задание 19
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Task19 {
    public static void main(String[] args) {
        String stroka = "    Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель    ";
        int words = 0;
        stroka=stroka.trim();

        StringTokenizer st = new StringTokenizer(stroka, " ,-");

        while (st.hasMoreTokens()) {
            st.nextToken();
            words++;

        }
        System.out.println("В строке " +words + " слов");



    }
}
