/*
 * Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h.
 * Результат представить в виде таблицы, первый столбец которой -- значение аргумента, второй --
 * соответсвующее значение функции
 */
package application;

import java.util.Scanner;

public class Task21_1 {
	private int a;
	private int b;
	private double h;
	
	Task21_1(Scanner scan)
	{
		a = scan.nextInt();
		b = scan.nextInt();
		h = scan.nextDouble();
	}
	
	public void calculate()
	{
		double x = a;
		double y = 0;
		do
		{
			y = x - Math.sin(x);
			show(x, y);
			x += h;
		}while(x <= b);
	}
	
	public void show(double x, double y)
	{
		System.out.println(x + "--" + y);
	}
}
