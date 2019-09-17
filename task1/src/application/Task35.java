/*
 * Даны натуральные числа M и N. Вывести старшую цифру дробной чатсти и малдшую цифру
 * целой части числа M/N.
 */
package application;

import java.util.Scanner;

public class Task35 {
	private double M;
	private double N;
	
	Task35(Scanner scan)
	{
		M = scan.nextInt();
		N = scan.nextInt();
	}
	
	public void div()
	{
		double a = M/N;
		int in = (int)a;
		show(in % 10);
		double fl = a - in;
		show((int)(fl * 10));
	}
	
	public void show(int m)
	{
		System.out.println(m);
	}
}
