/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
 * и самого числа. m и n вводятся с клавиатуры
 */
package application;

import java.util.Scanner;

public class Task27_1 {
	private int m;
	private int n;
	
	Task27_1(Scanner scan)
	{
		m = scan.nextInt();
		n = scan.nextInt();
	}
	
	public void div()
	{
		int x;
		for(int i = m; i <= n; i++)
		{
			x = i;
			int k = 2;
			System.out.println("n = " + x);
			while(k < x)
			{
				if((x % k) == 0)
					show(k);
				k++;
			}
		}
	}
	
	public void show(int m)
	{
		System.out.println(m);
	}
}
