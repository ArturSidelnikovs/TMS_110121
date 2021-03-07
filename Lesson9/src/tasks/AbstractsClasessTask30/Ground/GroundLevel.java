package tasks.AbstractsClasessTask30.Ground;
import tasks.AbstractsClasessTask30.Transport;

/*
В классе Наземный добавляются поля:
 -Количество колёс
 -Расход топлива(л/100км)
 */

public abstract class GroundLevel extends Transport {

   public int numberOfWheels;
   private int fuelСonsumption;

   public int getFuelСonsumption() {
      return fuelСonsumption;
   }

   public void setFuelСonsumption(int fuelСonsumption) {
      this.fuelСonsumption = fuelСonsumption;
   }
}
