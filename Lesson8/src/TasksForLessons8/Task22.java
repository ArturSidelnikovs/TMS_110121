package TasksForLessons8;
/*
Задание 22

Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {

        String str1 = new String("0Большойум7не8маленький  9 9");

        Pattern pat = Pattern.compile("\\d");
        Matcher mat = pat.matcher(str1);

        while(mat.find()){
            System.out.println(mat.group());
        }




    }
}
