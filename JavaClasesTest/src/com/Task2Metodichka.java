package com;
/*
2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Task2Metodichka {
    public static void main(String[] args) {
        int ameba [] = new int[24];
        int hours = 3;
        int kletki = 2;
        for (int i = 3; i <=ameba.length ; i+=3) {
            kletki+=2;
            System.out.println("Через  " + i + " часов "+"амеба будет делиться на " +kletki+ "клетки");



        }



    }
}
