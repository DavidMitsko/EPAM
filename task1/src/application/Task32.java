/*
 * Текущее опказание электронных часов: m ч(0<=m<=23), n мин(0<=n<=59) k с(0<=k<=59). Какое
 * время будут показывать часы через p ч q мин r с
 */
package application;

import java.util.Scanner;

public class Task32 {
	private int hour;
	private int minute;
	private int second;
	private int addHour;
	private int addMinute;
	private int addSecond;
	private int resultHour;
	private int resultMinute;
	private int resultSecond;
	
	Task32(Scanner scan)
	{
		hour = scan.nextInt();
		minute = scan.nextInt();
		second = scan.nextInt();
		addHour = scan.nextInt();
		addMinute = scan.nextInt();
		addSecond = scan.nextInt();
	}
	
	public void add()
	{
		int hourInDay = 24;
		int minuteInHour = 60;
		int secondInMinute = 60;
		resultHour = hour + addHour;
		if(resultHour > 23)
			resultHour -= hourInDay;
		resultMinute = minute + addMinute;
		if(resultMinute > 59)
			resultMinute -= minuteInHour;
		resultSecond = second + addSecond;
		if(resultSecond > 59)
			resultSecond -= secondInMinute;
		show(resultHour, resultMinute, resultSecond);
	}
	
	public void show(int h, int m, int s)
	{
		System.out.println(h + "ч" + m + "мин" + s + "с");
	}
}
