package tasks.AbstractsClasessTask30;

public interface PowerCalculation {


    default double calculationPower (int horsepower) {
        double powerKW = 0.74;
        for (double i = 0; i <horsepower; i++) {
            powerKW+= 0.74;
        }
        return powerKW;
    }


}
