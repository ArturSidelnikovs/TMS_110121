public class Task3 {
    /*Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
     */
    public static void main(String[] args) {
        int x = (int)(Math.random() * 5);
         if (x%x==0 & x%1==0) {
             System.out.println(x + " простое число ");
         } else {
             System.out.println(x + " не является простым числом");
         }

    }
}
