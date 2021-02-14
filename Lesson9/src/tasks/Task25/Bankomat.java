package tasks.Task25;
/*
Задание 25
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 */

public class Bankomat {

    public static int counter = 0;
    public static int nominal1 = 20;
    public static int nominal2 = 50;
    public static int nominal3 = 100;
    boolean put;
    boolean withdrawal;
    int dick = 0;



    public boolean PutTheMoney(int sum, boolean put) {
        System.out.println("Вы хотите положить деньги");
        for (counter = 0; counter < sum / nominal1; counter++) {
        }
        if (sum % 20 == 0) {
            System.out.println("Вы положили " +sum + " рублей " + counter + " купюрами, номиналом " + nominal1);
            put = true;
        } else if (sum % 50 == 0) {
            System.out.println("Вы положили " +sum + " рублей "+ counter + " купюрами, номиналом " + nominal2);
            put = true;
        } else if (sum % 100 == 0) {
            System.out.println("Вы положили сумму " +sum + " рублей " + counter + " купюрами, номиналом " + nominal3);
            put = true;
        } else {
            System.out.println("Положить деньги не получилось");

        }
        return put;
    }


    public boolean WithdrawalOfFunds(int money, boolean withdrawal) {
        System.out.println();
        System.out.println("Вы хотите снять деньги");
        for (counter = 0; counter < money/nominal1; counter++) {
        }
        if (money % 20 == 0 ) {
            System.out.println("Вы сняли " +money + " рублей " + counter + " купюрами, номиналом " + nominal1);
            withdrawal=true;
        } else if (money % 50 == 0) {
            System.out.println("Вы сняли " +money + " рублей " + counter + " купюрами, номиналом " + nominal2);
            withdrawal=true;
        } else if (money % 100 == 0) {
            System.out.println("Вы сняли " +money + " рублей " + counter + " купюрами, номиналом " + nominal3);
            withdrawal=true;
        } else {
            System.out.println("Снять деньги не получилось, банкомат не выдает такой номинал");
            withdrawal = false;
        }
        return withdrawal;
    }
}














