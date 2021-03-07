package tasks.AbstractsClasessTask30.Air;

/*
В классе Гражданский добавляются поля:
 - Кол-во пассажиров
 - Наличие бизнес класса (true/false)
 */

/*
В конечных классах (Легковой, Грузовой, Военный, Гражданский)
разработать метод описание который будет возвращать составленную строку
с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах производится в отдельном методе :
1 л.с = 0.74 кВ
 */

public class Civil extends Air{

    public int numberOfPassengers = (int) (Math.random() * 200);

    public Civil() {
        setBrand("Boeing 777");
        setMaxSpeed(1120);
        setWeight(10000);
        setBodytype("Пассажирский самолет");
        setHorsepower(2340);
        setBandLength(2200);
        setWingspan(35);

    }

        public void Capacity (int capacity) {
        if (capacity<=numberOfPassengers) {
            System.out.println("Самолет может вместить в себя столько пассажиров");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }


    public void TypeCivil () {
        System.out.println(getBodytype()+" "+getBrand() + " весом " + getWeight() + " с максимальной скоростью " +
                getMaxSpeed()+ " мощностью " + calculationPower (getHorsepower()) +
                " киловатт, с размахом крыльев " + getWingspan() + " и длинной посадочной полосы " + getBandLength());
    }
}
