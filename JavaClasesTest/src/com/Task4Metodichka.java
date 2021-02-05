package com;
/*
Напишите программу печати таблицы перевода расстояний
из дюймов в сантиметры для значений длин
от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task4Metodichka {
    public static void main(String[] args) {
        double inches [] = new double[21];
        double centimeters = 2.54;
        for (int i = 1; i <inches.length; i++) {
            centimeters*=i;
            System.out.println("В " + i + " дюйме(ах) " + centimeters + " сантиметров");
        }

    }
}
