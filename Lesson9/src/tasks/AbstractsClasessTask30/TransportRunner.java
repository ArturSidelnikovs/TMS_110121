package tasks.AbstractsClasessTask30;

import tasks.AbstractsClasessTask30.Air.Civil;
import tasks.AbstractsClasessTask30.Air.Military;
import tasks.AbstractsClasessTask30.Ground.CargoTrucks;
import tasks.AbstractsClasessTask30.Ground.PassengerСar;

public class TransportRunner implements PowerCalculation{
    public static void main(String[] args) {

        CargoTrucks cargoTruck = new CargoTrucks();
        PassengerСar passengerСar = new PassengerСar();
        Military military = new Military();
        Civil civil = new Civil();

        passengerСar.TypePasCar();
        passengerСar.FullStr (10);

        System.out.println();

        cargoTruck.TypeCargo();

        System.out.println();

        civil.TypeCivil();
        civil.Capacity(150);

        System.out.println();

        military.TypeMilitary();
        military.Shot();
        military.Ejection();


    }








}
