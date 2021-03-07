package Tasks.task2;

/*
Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
(поле обязательное) MyService и кодовое название версии
(поле не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).

Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo),
который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.

Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует
- создавать экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo
(использовать возможности пакета reflection).
 */
@AnnotationMyS (versionClass = 10.1)
public class MyService {

    private int users;
    private String name;



    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     void thisClassInfo () {
        System.out.println("Данный сервис нассчитывает " +getUsers() + " пользователей и называется " + getName());
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
