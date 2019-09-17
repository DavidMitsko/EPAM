/*
 * Найти произведение цифр заданного четырёхзначного числа
*/
package application;

import java.util.Scanner;

public class Task16 {
	private int number;
	private int array[];
	
	Task16(Scanner scan)
	{
		number = scan.nextInt();
		array = new int[4];
	}
	
	public void separation()
	{
		for(int i = 0; i < 4; i++)
		{
			array[i] = number % 10;
			number /= 10;
		}
	}
	
	public int mul()
	{
		int n_mul = 1;
		for(int i = 0; i < 4; i++)
		{
			n_mul *= array[i];
		}
		show(n_mul);
		return n_mul;
		
	}
	
	public void show(int m)
	{
		System.out.println(m);
	}
}
