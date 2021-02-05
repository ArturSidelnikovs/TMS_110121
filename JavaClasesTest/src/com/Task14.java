/*
Задание 15
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).

 */
package com;
import javax.sound.midi.Soundbank;

public class Task14 {
    public static void main(String[] args) {
        int[] elements = new int[10];
        for (int first = 0; first < elements.length; first++) {
            elements[first] = ((int) (Math.random() * 12));
            System.out.println(elements[first]);
        }
        System.out.println("*************************");
        for (int last = elements.length-1; last >= 0; last--) {
            System.out.println(elements[last]);
        }
    }
}



