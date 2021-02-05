package com;

/*
Задание 17
Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */
public class Task17 {
    public static void main(String[] args) {
        char butterFly[][] = new char[5][5];

        for (int i = 0; i < butterFly.length; i++) {
            for (int j = i; j < butterFly.length - i; j++) {
                butterFly[i][j] = '1';
            }
        }
        for (int i = butterFly.length - 1; i > butterFly.length / 2 - 1; i--) {
            for (int j = i; j > butterFly.length - i - 2; j--) {
                butterFly[i][j] = '1';
            }
        }
        for (int i = 0; i < butterFly.length; i++) {
            for (int j = 0; j < butterFly[i].length; j++) {
                if (butterFly[i][j] == '\u0000') {
                    butterFly[i][j] = '0';
                }
                System.out.print(butterFly[i][j] + " ");
            }
            System.out.println();
        }

    }
}
