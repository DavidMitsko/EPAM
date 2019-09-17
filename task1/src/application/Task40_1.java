/*
 * Получить все числа, не превышающие заданного N, которые делятся без остатка на все свои 
 * цифры.
 */
package application;

import java.util.Scanner;

public class Task40_1 {
	private int N;
	
	Task40_1(Scanner scan)
	{
		N = scan.nextInt();
	}
	
	public void find()
	{
		int length;
		for(int i = 1; i <= N; i++)
		{
			boolean flag = true;
			length = (int)Math.log10(i) + 1;
			int array[] = new int[length];
			array = separation(i, length);
			for(int j = 0; j < length; j++)
			{
				if(array[j] == 0)
				{
					flag = false;
					break;
				}
				if(i % array[j] != 0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
				show(i);
		}
	}
	
	public int[] separation(int number, int n)
	{
		int array[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			array[i] = number % 10;
			number /= 10;
		}
		return array;
	}
	
	public void show(int x)
	{
		System.out.println(x);
	}
}
