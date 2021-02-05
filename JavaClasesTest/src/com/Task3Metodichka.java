package com;
/*
)Вычислить: 1+2+4+8+...+2564)Составьте программу,
вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task3Metodichka {
    public static void main(String[] args) {

        int igra[] = new int[10];
        int a = 1;
        while (a<=2564) {
            a+=a;
            System.out.println(a);
        }
    }
}

