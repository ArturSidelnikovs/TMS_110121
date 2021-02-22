package tasks.AbstractsClasessTask30.Air;

/*
В классе Военный  добавляются поля:
- Наличие системы катапультирования (true/false) - Кол-во ракет на борту
 */

/*
В конечных классах (Легковой, Грузовой, Военный, Гражданский)
разработать метод описание который будет возвращать составленную строку
с описанием всех характеристик объекта. В строку включить ещё один параметр мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах производится в отдельном методе :
1 л.с = 0.74 кВ
 */

/*
Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет
не равно 0 то выводим на консоль “ Ракета пошла…”, если 0 то
“Боеприпасы отсутствуют”.
А так же метод катапультирование, который проверит если наличие системы катапультирования true,
то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”
 */

public class Military extends Air {

    public int numberOfMissiles = (int) (Math.random() * 6);
    public boolean ejection;

    public Military() {
        setBrand("Boeing 777 military");
        setMaxSpeed(1120);
        setWeight(10000);
        setBodytype("Военный самолет");
        setHorsepower(2340);
        setBandLength(2200);
        setWingspan(35);

    }


    public int Shot () {
        if (numberOfMissiles!=0) {
            System.out.println("Ракета пошла…");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
        return numberOfMissiles;
    }

    public boolean Ejection () {
        if (ejection = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
        return ejection;
    }

    public void TypeMilitary () {
        System.out.println(getBodytype()+" "+getBrand() + " весом " + getWeight() + " с максимальной скоростью " +
                getMaxSpeed()+ " мощностью " + calculationPower (getHorsepower()) +
                " киловатт, с размахом крыльев " + getWingspan() + " и длинной посадочной полосы " + getBandLength());
    }


}
