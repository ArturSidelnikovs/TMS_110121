package com;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
 */

public class Task7Metodichka {
    public static void main(String[] args) {
        int еvenNumber = 0;
        int delenitOtOstatka = 0;
        for (int i =0; i <=99 ; i++) {
            еvenNumber++;
            delenitOtOstatka = еvenNumber%2;
            if (delenitOtOstatka!=0) {
                System.out.println(еvenNumber);
            } else {
                continue;
            }
        }

    }
}
