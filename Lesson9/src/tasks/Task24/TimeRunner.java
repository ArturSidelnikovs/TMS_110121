package tasks.Task24;

public class TimeRunner {
    public static void main(String[] args) {

        PeriodOfTime p1 = new PeriodOfTime(10,15,2);
        PeriodOfTime p2 = new PeriodOfTime(10,15,15);

        p1.Conclusion();
        p2.Conclusion();

        System.out.println(p1.equals(p2));


    }
}



