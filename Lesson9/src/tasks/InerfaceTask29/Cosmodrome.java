package tasks.InerfaceTask29;
/*
Создаем класс Космодром.
В классе создаем метод:
• запуск
Метод запуск принимает объект типа IStart.
В методе первым делом осуществляем предстартовую проверку переданного объекта,
если она провалилась(метод вернул false) выводим сообщение «Предстартовая проверка провалена».
Если проверка прошла успешно, то производим запуск двигателей(вызываем метод запуска двигателя).
После этого производиться обратный отсчет (10 ..... 1).
После обратного отсчета вызываем метод старт переданного объекта.
 */

public class Cosmodrome  {


    public static void StartShattle (IStart shattle) {

        if (shattle.PreLaunchCheck()) {
            System.out.println("Предстартовая проверка прошла успешно");
            shattle.StartingTheEngine();
            int counter = 10;
            for (int i = 10; i > 1; i--) {
                counter--;
            }
            System.out.println(counter);
            shattle.Start();
        } else {
            System.out.println("Не удалось запустить корабль");
        }
    }

}
