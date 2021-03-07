package Tasks.task1;
/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get (int index), который возвращает любой элемент
массива по индексу.
 */

public class Generics <Type extends Number> {

    private Type [] index1;


    public Type[] getIndex1() {
        return index1;
    }

    public void setIndex1(Type[] index1) {
        this.index1 = index1;
        }


    public Type getIndex (int index) {
        System.out.println("Под индексом " + index);
        return index1[index];
    }


}




