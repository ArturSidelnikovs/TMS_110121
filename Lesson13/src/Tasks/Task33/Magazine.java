package Tasks.Task33;
/*
Создать класс Магазин, поля:
•Список товаров (изначально пустой)
методы:
•добавить товар(принимает объект товара и добавляет его в список
товаров). При попытке добавить товар с id уже существующем в списке,
вставка производится не должна
•получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
магазине)
•удалить товар (метод принимает id товара и удаляет из списка товар с
соответствующим id)
•редактировать товар(принимает объект товара и редактирует им список
товаров)

Обратите внимание что id товара и индекс товара в списке — это разные вещи,
не перепутайте. Id товара — это поле вашего объекта,
которое должно автоматически задаваться при создании каждого нового товара
и должно быть уникальным (начинаться должно с 1). А индекс товара в списке товаров,
это по сути его порядковый номер в списке(начинается с 0).
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Magazine {


    public List<Product> listOfProducts = new ArrayList<>();

    public void putOfProduct(Product product) {
        for (Product type : listOfProducts) {
            if (product.getId() == type.getId()) {
                break;
            } else {
                listOfProducts.add(product);
            }
        }
    }


    public List<Product> getListOfProducts() {
        return listOfProducts;
    }


    public void removeProduct(int id) {
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getId() == id) {
                listOfProducts.remove(i);
            }
        }
    }


    public void editProduct(Product product, String name, int price, int id) {
        boolean success = false;
        String tempName = product.getName();
        for (Product value : listOfProducts) {
            if (product.getId() == value.getId()) {
                product.setName(name);
                product.setPrice(price);
                product.setId(id);
                success = true;
                break;
            }
        }
        if (success) {
            System.out.println("Товар " + tempName + " успешно отредактирован! теперь это " + product.getName() + "!\n");
        } else {
            System.out.println("В списке нет такого товара(\n");
        }
    }

    public void sortProductsListByPrice() {
        List<Product> sortedList = getListOfProducts();
        for (int i = 0; i < sortedList.size() - 1; i++) {
            for (int j = 0; j < sortedList.size() - 1 - i; j++) {
                if (sortedList.get(j).getPrice() > sortedList.get(j + 1).getPrice()) {
                    Product temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }
    }

    public void removeProducts (int id) {
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getId() == id) {
                listOfProducts.remove(i);
            }
        }
    }

    public void sortProductsListByAdded() {
        List<Product> sortedList = getListOfProducts();
        for (int i = 0; i < sortedList.size() / 2; i++) {
            Product temp = sortedList.get(i);
            sortedList.set(i, sortedList.get(sortedList.size() - 1 - i));
            sortedList.set(sortedList.size() - 1 - i, temp);
        }
    }

    public void printProductsList() {
        for (Product product : listOfProducts) {
            System.out.println("Название продута: " + product.getName() + ", ID: " + product.getId() + ", цена: "
                    + product.getPrice() + "$");
        }
        System.out.println();
    }

}




