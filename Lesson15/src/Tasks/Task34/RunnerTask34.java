package Tasks.Task34;

/*
Задание 34
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
 */

import java.security.Provider;

public class RunnerTask34 {
    public static void main(String[] args) {
        TextClassTask34  textClassTask34 = new TextClassTask34();
        textClassTask34.showNumbers(textClassTask34.findNumbersInFile());

        System.out.println("\nSum: " + textClassTask34.sumOfNumbers(textClassTask34.findNumbersInFile()));

        textClassTask34.showNumbers(textClassTask34.noEqualsNumbers(textClassTask34.findNumbersInFile()));

    }

}
