package TasksForLessons8;
/*
Задание 21
Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */

public class Task21 {
    public static void main(String[] args) {

        String str1 = "Agent пьет вино и слушает джигана, его выгнали со школы";
        StringBuilder str2 = new StringBuilder("Agent пьет вино и слушает джигана, его выгнали со школы");
        StringBuffer str3 = new StringBuffer("Agent пьет вино и слушает джигана, его выгнали со школы");

        double start_First_Text = System.currentTimeMillis();
        while (str1.length()==str2.length()){
            str1 += " - Его зовут Гриша";
        }
        double end_First_Text = System.currentTimeMillis();
        double fullTimeFirstText = end_First_Text - start_First_Text;

        double start_Seconds_Text = System.currentTimeMillis();
        while (str1.length()==str2.length()) {
            str2.append(" - Его зовут Гриша");
        }
        double end_Seconds_Text = System.currentTimeMillis();
        double full_Time_Second_Text = end_Seconds_Text - start_Seconds_Text;

        double start_Thirsd_Text = System.currentTimeMillis();
        while (str1.length()==str2.length()) {
            str3.append(" - Его зовут Гриша");
        }
        double end_Thirsd_Text = System.currentTimeMillis();
        double full_Time_Thirsd_Text = end_Thirsd_Text - start_Thirsd_Text;

        System.out.println("Время выполнения первого цикла равна " + fullTimeFirstText + " миллисекундам");
        System.out.println("Время выполнения первого цикла равна " + full_Time_Second_Text + " миллисекундам");
        System.out.println("Время выполнения первого цикла равна " + full_Time_Thirsd_Text + " миллисекундам");

    }
}
