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
	      int s = 4500;
	      int sec = s % 60;
				  int m = (s-sec)/60;
				  int min = m % 60;
				  int h = (m-min)/60;
				  int hours = h % 60;
				  int d = (h - hours)/24;
				  int days = d % 24;
				  int w = (d - days)/24;
				  int weekend = w % 24;
						  System.out.println(min + " " + "минут"+ " " + sec + " " + "секунд" );
		                  System.out.println(h +" " + "час"+ " " + min +" " + "минут" + " " + sec + " " + "секунд") ;
		                  System.out.println(days+ " " + "дней "+ " " +hours+ " " + "часов"+ " " + min +" " + "минут" + " " + sec+ " " + "секунд") ;
		                  System.out.println(weekend+" " + "недель "+ " " + days+" " + "дней "+ " " +hours+ " " + "час"+" " + min +" " + "минут" + " " + sec+ " " + "секунд") ;




    }
}
