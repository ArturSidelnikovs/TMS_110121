package Tasks.Task34;

/*
Задание 34
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextClassTask34 {

    public List<Double> findNumbersInFile() {
        List<Double> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("TextTask34"))) {
            Pattern pattern = Pattern.compile("-?\\d+\\.?(\\d+)?", Pattern.UNICODE_CHARACTER_CLASS);
            StringBuilder stringBuilder = new StringBuilder();
            String number;
            while ((number = reader.readLine()) != null) {
                stringBuilder.append(number);
            }
            Matcher matcher = pattern.matcher(stringBuilder);
            while (matcher.find()) {
                numbers.add(Double.parseDouble(matcher.group()));
            }

        } catch (IOException e) {
            System.err.println("File not found");
        }
        return numbers;
    }

    public double sumOfNumbers(List<Double> numbers) {
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public Set<Double> noEqualsNumbers(List<Double> numbers) {
        Set<Double> noEqualsNumbers = new LinkedHashSet<>(numbers);
        return noEqualsNumbers;
    }


    public void showNumbers(List<Double> numbers) {
        for (Double number : numbers) {
            System.out.print(number + "    ");
        }
    }


    public void showNumbers(Set<Double> numbers) {
        for (Double number : numbers) {
            System.out.print(number + "    ");
        }
        }
    }
