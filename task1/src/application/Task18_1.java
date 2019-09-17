/*
 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше 
 * или равен заданному е
 */
package application;

import java.util.Scanner;

public class Task18_1 {
	private double e;
	private double sum;
	
	Task18_1(Scanner scan)
	{
		e = scan.nextDouble();
		sum = 0;
	}
	
	public double calculate(int n)
	{
		double a;
		a = Math.pow(-1, (n-1))/n;
		return a;
	}
	
	public void add()
	{
		double a;
		int n = 1;
		do
		{
			a = calculate(n);
			n++;
			if(Math.abs(a) >= e)
			{
				show(a);
				sum += a;
			}
		}while(Math.abs(a) >= e);
		show(sum);
	}
	
	public void show(double m)
	{
		System.out.println(m);
	}
}
