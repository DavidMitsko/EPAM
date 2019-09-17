/*
 * Дано натуральное число, которое прелставляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах
 */

package application;

import java.util.Scanner;

public class Task22 {
	private int number;
	
	Task22(Scanner scan)
	{
		number = scan.nextInt();
	}
	
	public void change()
	{
		int hour;
		int sec_in_h = 3600;
		int sec_in_min = 60;
		hour = (int)number/sec_in_h;
		number = number % sec_in_h;
		int minute;
		minute = (int)number/sec_in_min;
		int second;
		second = number % sec_in_min;
		show(hour, minute, second);
	}
	
	public void show(int h, int m, int s)
	{
		System.out.println(h + "ч" + m + "мин" + s + "с");
	}
}
