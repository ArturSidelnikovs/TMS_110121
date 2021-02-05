package com;
/*
Задание 16
Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.
 */
public class Task15 {
    public static void main(String[] args) {
        int elements[] = new int[9];
        int minIndex = 0;
        int maxIndex = 0;
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = ((int) (Math.random() * 12) + 15);
        }
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j< elements.length - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        for (int x: elements) {
            System.out.print(x+" ");
        }
        for (int x = 1; x < elements.length - 1; x++) {
            sum += elements[x];
        }
        System.out.println();
        System.out.println("Минимальное значение между " + elements[0]);
        System.out.println("Максимальное значение " + elements[elements.length - 1]);
        System.out.println("Cумма значений массива между минимальным и максимальными значениями равна " + sum);


    }
}



















