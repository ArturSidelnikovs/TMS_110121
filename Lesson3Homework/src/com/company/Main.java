package com.company;
/*Задание 3
Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.
 */
public class Main {
public static void main(String[] args) {
	 int s = 9129889;
		 int sec = s % 60;
				  int m = (s-sec)/60;
	              int min = m % 60;
	              int h = (m-min)/60;
	              int hours = h % 24;
				  int d = (h - hours)/24;
				  int days = d % 7;
				  int w = (d - days)/7;
				          System.out.println(min + " " + "минут"+ " " + sec + " " + "секунд" );
		                  System.out.println(h +" " + "час(ов)"+ " " + min +" " + "минут" + " " + sec + " " + "секунд") ;
		                  System.out.println(days+ " " + "дня(ей) "+ " " +hours+ " " + "часов(ов)"+ " " + min +" " + "минут" + " " + sec+ " " + "секунд") ;
		                  System.out.println(w+" " + "недель "+ " " + days+" " + "дней "+ " " +hours+ " " + "час(ов)"+" " + min +" " + "минут" + " " + sec+ " " + "секунд") ;

    }
}
