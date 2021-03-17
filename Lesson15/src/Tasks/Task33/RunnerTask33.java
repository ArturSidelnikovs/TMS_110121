package Tasks.Task33;
/*
Задание 33
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 */

import java.io.FileNotFoundException;

public class RunnerTask33 {
    public static void main(String[] args) throws FileNotFoundException {

        WordsPunctuationCounter wpc = new WordsPunctuationCounter();

        System.out.println(wpc.WordsCounter() + " - количество слов");
        System.out.println(wpc.PunctuationCounter() + " - количество символов");

    }
}

