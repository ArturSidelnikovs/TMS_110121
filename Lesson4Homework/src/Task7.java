import com.sun.source.tree.IfTree;

public class Task7 {
    /*Задание 7
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
     */
    public static void main(String[] args) {
        int a = 10, b = 15, r = 10;

        int perimetrAB = (a+b)*2;
        System.out.println("Периметр прямоугольника AB =" + " " + perimetrAB);
        int diametrСircle = r*2;
        System.out.println("Диаметр круга ="+ " " + diametrСircle);
        if (diametrСircle>=perimetrAB) {
            System.out.println("Круг полностью закрывает прямоугольник");
        } else {
            System.out.println("Круг не закрывает полностью прямоугольник");
        }









    }
}
