package TasksForLessons8;
/*Задание 20
Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {
    public static void main(String[] args) {
        String stroka = "Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель";
        StringBuilder last = new StringBuilder();

        Pattern pat = Pattern.compile("\\w\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher match = pat.matcher(stroka);

        while (match.find()) {
            last.append(match.group());
        }

        System.out.println(last);


    }
}
