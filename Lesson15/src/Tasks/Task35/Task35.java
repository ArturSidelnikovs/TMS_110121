package Tasks.Task35;
/*
Задание 35
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task35 {

        public void WriteToFile () throws IOException {
            Random random = new Random();
            try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("hello.dat")));) {
                for (int i = 0; i < 20; i++) {
                    dataOutputStream.writeInt(random.nextInt(20));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public List <Integer> ReadFromFile () throws IOException {
        List<Integer> numbers = new ArrayList<>();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("hello.dat")));
        while (dataInputStream.available() > 0) {
            numbers.add(dataInputStream.readInt());

        }
        return numbers;
    }

    public int average() throws IOException {
        List<Integer> numbers = ReadFromFile();
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }


}





