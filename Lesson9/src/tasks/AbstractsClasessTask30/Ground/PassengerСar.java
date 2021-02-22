package tasks.AbstractsClasessTask30.Ground;

/*
В классе Легковой добавляются поля:
- Тип кузова - Кол-во пассажиров
 */

/*
В конечных классах (Легковой, Грузовой, Военный, Гражданский)
разработать метод описание который будет возвращать составленную строку
с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах производится в отдельном методе :
1 л.с = 0.74 кВ
 */

import tasks.AbstractsClasessTask30.PowerCalculation;

public class PassengerСar extends GroundLevel implements PowerCalculation {

    public int numberOfPassengers;
    double distance;
    double fullFuel;


     public PassengerСar() {
        setBrand("BMW");
        setMaxSpeed(120);
        setWeight(1120);
        setBodytype("Легковой автомобиль");
        setHorsepower(240);
        setFuelСonsumption(10);
        distance = 1500;
    }


    public void FullStr (double time) {
        double distance = (double) (getMaxSpeed() * time);
        System.out.println("За время " + time + " часов " + getBodytype() + " " + getBrand() +
                "  двигаясь с максимальной скростью " + getMaxSpeed() + "км/ч израсходует " + FuelСonsumption (distance) + " литров топлива и проедет" +
                " расстояние " + distance + "км.");
    }

    public void TypePasCar () {
        System.out.println(getBodytype()+" "+getBrand() + " весом " + getWeight() + " с максимальной скоростью " +
                getMaxSpeed()+ " мощностью " +getHorsepower() + " лошадинных сил, равной " + calculationPower (getHorsepower()) +
                " киловатт, с расходом "+ getFuelСonsumption() + " литров, на 100 км" );

    }

    public double FuelСonsumption (double distance) {
        return (distance/100)*getFuelСonsumption();
    }



    }


