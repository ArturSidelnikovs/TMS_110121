package Tasks.Task33;

/*
В main:
•создаем объект магазина
•создаем пару тройку товаров и добавляем эти товары в магазин
•получаем список товаров из магазина, сортируем по цене(по
возрастанию) и выводим в консоль.
•удаляем один товар
•получаем список товаров из магазина, сортируем по порядку
добавления(последние добавленные в начале) и выводим в консоль.
•редактируем один товар
•получаем список товаров и выводим в консоль
 */

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {

        Magazine magazine = new Magazine();

        Product vegetable = new Product("Марковка", 33, 9);
        Product egg = new Product("Яйцо", 21, 5);

        magazine.listOfProducts.add(vegetable);
        magazine.listOfProducts.add(egg);
        magazine.printProductsList();
        magazine.sortProductsListByPrice();

        magazine.removeProduct(10);
        magazine.printProductsList();
        magazine.sortProductsListByAdded();

        magazine.editProduct(vegetable,"Перец", 10,4);
        magazine.printProductsList();








    }
}
