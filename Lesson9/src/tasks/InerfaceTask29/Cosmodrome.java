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


import com.sun.source.tree.IfTree;

public class Cosmodrome implements IStart {

    public static void StartCosmodrome (IStart object) {

        int counter = 10;

        if (object.PreLaunchCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            object.StartingTheEngine();
            System.out.println("Предстартовая проверка прошла успешно");
            for (int i = 10; i > 1; i--) {
                counter--;
                System.out.println(counter);
            }
            object.Start();
        }
    }


        @Override
        public void StartingTheEngine () {
        }

        @Override
        public void Start () {
        }

    }
