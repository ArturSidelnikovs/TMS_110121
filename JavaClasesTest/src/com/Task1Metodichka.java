package com;
/*
)Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какойсуммарный путь пробежит спортсмен за 7 дней?
 */
public class Task1Metodichka {
    public static void main(String[] args) {
        int kilometrs [] = new int[7];
        int sum = 0;
        int put=33;
        System.out.println("В первый день спортсмен пробежал " + put + " километров");
        for (int i = 0; i <=kilometrs.length-2; i++) {
            put=((put*10)/100) + put;
            System.out.println(put);
            sum+=put;
        }
        System.out.println();
        System.out.println(sum);
    }
}
