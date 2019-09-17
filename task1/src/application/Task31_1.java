/*
 * Компьютер генерирует 5 чисел в диапазоне от 0 до 15. Человек пытается их угадать. 
 * Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа,
 * а также ошибочные чила пользователя
 */
package application;

import java.util.Scanner;
import java.util.Random;

public class Task31_1 {
	private int arrayRand[];
	private int arrayUser[];
	
	Task31_1(Scanner scan)
	{
		Random random = new Random();
		arrayUser = new int[5];
		arrayRand = new int[5];
		for(int i = 0; i <= 4; i++)
		{
			arrayRand[i] = random.nextInt(15);
			arrayUser[i] = scan.nextInt();
		}
	}
	
	public void check()
	{
		for(int i = 0; i <= 4; i++)
			System.out.println(arrayRand[i]);
		for(int i = 0; i <= 4; i++)
		{
			boolean flag = false;
			for(int j = 0; j <= 4; j++)
			{
				if(arrayUser[i] == arrayRand[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == true)
				show(arrayUser[i], true);
			else
				show(arrayUser[i], false);
		}
	}
	
	public void show(int m, boolean n)
	{
		System.out.print(m + "  ");
		System.out.println(n);
	}
}
