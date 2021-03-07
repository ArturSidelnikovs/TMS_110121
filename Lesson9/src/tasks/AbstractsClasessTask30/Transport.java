package tasks.AbstractsClasessTask30;

/*
В классе Транспорт есть поля:
- Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг)
 Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )

 */

public abstract class Transport implements PowerCalculation {

    private int horsepower;
    private int maxSpeed;
    private int weight;
    private String brand;
    private String bodytype;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }


}
