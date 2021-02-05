package com;
/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */

public class Task5Metodichka {
    public static void main(String[] args) {
        int еvenNumber = 0;
        int delenitOtOstatka = 0;
        for (int i =0; i <=100 ; i++) {
            еvenNumber++;
            delenitOtOstatka = еvenNumber%2;
            if (delenitOtOstatka==0) {
                System.out.println(еvenNumber);
            } else {
                continue;
            }
        }
    }
}
