/*
 * ƒано действительное число вида nnn.ddd. ѕомен€ть местами дробную и целую части числа
 */

package application;

import java.util.Scanner;

public class Task21 {
	private double number;
	
	Task21(Scanner scan)
	{
		number = scan.nextDouble();
	}
	
	public void change()
	{
		double in;
		double fl;
		int thausend = 1000;
		fl = number % 1;
		in = (int)number;
		double result;
		result = fl* thausend + in/ thausend;
		show(result);
	}
	
	public void show(double m)
	{
		System.out.println(m);
	}
}
