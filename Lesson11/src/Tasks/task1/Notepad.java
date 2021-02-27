package Tasks.task1;
/*
Создать класс Notepad с внутренним классом или классами, с помощью объек-
тов которого могут храниться несколько записей на одну дату.
 */


public class Notepad {

    Dates dates = new Dates();
    private int date;


    public int getDate() { return date; }

    public void setDate(int date) { this.date = date; }

    Notepad () { setDate(9); }


         public class Dates {
             public void dddate() {
                if (date <= 10) {
                    System.out.println("Запись #1");
                    System.out.println("Запись #2");
                    System.out.println("Запись #3");
                } else {
                    System.out.println("На эту дату свободна запись на ноготочки");
                    System.out.println("На эту дату свободна запись на волосы");
                }
            }
        }

        void getsDate () { dates.dddate(); }
    }



