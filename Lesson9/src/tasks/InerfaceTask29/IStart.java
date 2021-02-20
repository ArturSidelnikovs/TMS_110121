package tasks.InerfaceTask29;

/*
Создаем интерфейс IStart.
В интерфейсе определяем методы:
• предстартовая проверка систем(возвращает true/false)
• запуск двигателей(void)
• старт(void)
 */

public interface IStart {

    boolean prelaunchcheck=false;

    void StartingTheEngine ();
    void Start();

    default boolean PreLaunchCheck () {
        return prelaunchcheck;
    }
}


