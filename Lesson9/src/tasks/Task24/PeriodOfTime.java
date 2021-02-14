package tasks.Task24;

/*
Задание 24
Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.
 */


public class PeriodOfTime {

    public int seconds;
    public int minutes;
    public int hours;
    int m;
    int h;


    PeriodOfTime(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        if (seconds >= 60) {
            m = seconds / 60;
            this.seconds = seconds % 60;
        }

        this.minutes = minutes + m;
        if (this.minutes >= 60) {
            h = this.minutes / 60;
            this.minutes %= 60;
        }
        this.hours = hours + h;
    }

    PeriodOfTime(int sec) {
        this.seconds = sec;
    }

    int SumSec() {
        return seconds + minutes * 60 + hours * 3600;
    }

    void Conclusion () {
        System.out.println("Общее количество секунд в объекте " +SumSec());
    }


}



