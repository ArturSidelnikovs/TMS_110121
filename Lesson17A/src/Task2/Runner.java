package Task2;

/*
2) Написать клиент для работы обменника.
Люди могут подходить к обменнику чтобы купить/продать доллары или ЕВРО.
Количество долларов и ЕВРО в обменнике не должно превышать какого-то заранее
заданного предела и не должно оказаться меньше нуля.
Каждый человек так же не может купить или продать долларов или ЕВРО больше,
чем какое-то определенное значение. В нашей программе, имитирующей торговый центр,
работает несколько обменников. Одновременно в одном обменнике может находится только один человек.
Человек может как покупать или продавать валюту так и делать обе эти операции одновременно
(покупать доллары и продавать ЕВРО).

Задачи следует решать с применением потоков.
 */

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws InterruptedException {


        List<Converter> offices = new ArrayList<>();
        Converter converter = new Converter("First office");
        Converter converter2 = new Converter("Second office");
        Converter converter3 = new Converter("Third office");
        offices.add(converter);
        offices.add(converter2);
        offices.add(converter3);
        for (Converter exchangeOffice1 : offices) {
            exchangeOffice1.start();
            Thread.sleep(100);
        }

    }

}
