package com.company;

/*Задание 4
*Определить число, полученное выписыванием в обратном порядке цифр
*любого 4-х значного натурального числа n.
* */

public class Task4 {
    public static void main(String[] args) {
        int n  = 5678;
        int number;
        int a, b, c, d;

        a = (n % 10) * 10;
        b = (n % 100) / 10;
        a = (a + b) * 10;
        c = (n % 1000) / 100;
        a = (a + c) * 10;
        d = (n % 10000) / 1000;

        number = a + d;

        System.out.println("Число, записанное в обратном порядке 4х значного натурального числа " + number);

    }
}
