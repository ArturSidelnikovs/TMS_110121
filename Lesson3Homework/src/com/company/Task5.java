package com.company;

/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
* различны?
*/

public class Task5 {
    public static void main(String[] args) {
        int number = 1432;
        int a, b, c, d;

        a = (number % 10000) / 1000;
        b = (number % 1000) / 100;
        c = (number % 100) / 10;
        d = number % 10;

        if (((a != b) & (a != c) & (a != d)) & ((b != c) & (b != d)) & (c != d)) {
            System.out.println("Цифры числа " + number + " различны");
        } else {
            System.out.println("Цифры числа " + number + "не различны");

        }
    }
}



