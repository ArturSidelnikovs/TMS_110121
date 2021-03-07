package Tasks.task2;

/*
Создать класс Payment с внутренним классом, с помощью объектов кото-
рого можно сформировать покупку из нескольких товаров.
 */

import java.util.regex.Pattern;

public class Payment {

     private int dollars;
     Purchase purchase = new Purchase();

    public int getDollars() { return dollars;}
    public void setDollars(int dollars) { this.dollars = dollars;}

    Payment () { setDollars(300);}


    class Purchase {
        void Calculation () {
            if (dollars<=100) {
                System.out.println("Покупаем тапки");
            } else if (dollars>=200) {
                System.out.println("Кроме тапок нам еще хватит на куртку");
            }
        }
    }

    void BuyIt () {
        purchase.Calculation();
    }
}
