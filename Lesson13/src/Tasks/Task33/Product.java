package Tasks.Task33;

/*
Магазин
Создать класс Товар, поля:
•id(целое число)
•name(строка)
•price(целое число)
 */

public class Product {

    private int id;
    private String name;
    private int price;

    Product(String name, int id, int price) {
        setName(name);
        setId(id);
        setPrice(price);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
