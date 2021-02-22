package tasks.AbstractsClasessTask30.Air;
import tasks.AbstractsClasessTask30.Transport;

/*
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта
 */

public abstract class Air extends Transport {

    private int wingspan;
    private int bandLength;




    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getBandLength() {
        return bandLength;
    }

    public void setBandLength(int bandLength) {
        this.bandLength = bandLength;
    }
}
