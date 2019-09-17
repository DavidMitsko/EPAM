/*
 * Составить линейную программ, печатающую значение true, если указанное высказывание является 
 * истинными, и false -- в противном случае:
 * - Целое число N является чётным двузначным числом.
 * - Сумма двух первых цифр заданного четырёхзначного числа равна сумме двух его последних цифр.
 * - Сумма цифр данного трёхзначного числа N является чётным числом.
 * - Точка с координатами (x,y) принадлежит плоскости, лежащей между прямыми x = m, x = n, (m < n)
 * - Квадрат заданного трёхзначного числа равен кубу суммы цифр этого числа.
 * - Треуголник со сторонами a,b,c является равнобедренным.
 * - Сумма каких-либо двух цифр заданного трёхзначного натурального числа N равна третьей цифре.
 * - Заданное число N является степенью числа a (показатель степени может находиться в диапазоне от 0 до 4).
 * - График функции y = ax^2 + bx + c проходит через заданную точку с координатми (m, n).
 */
package application;

import java.util.Scanner;

public class Task37 {
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;
	private int fourthX;
	private int fourthY;
	private int fourthM;
	private int fourthN;
	private int fifthNumber;
	private int sixthA;
	private int sixthB;
	private int sixthC;
	private int seventhNumber;
	private int eighthN;
	private int eighthA;
	private int ninthA;
	private int ninthB;
	private int ninthC;
	private int ninthM;
	private int ninthN;
	
	Task37(Scanner scan)
	{
		firstNumber = scan.nextInt();
		secondNumber = scan.nextInt();
		thirdNumber = scan.nextInt();
		fourthX = scan.nextInt();
		fourthY = scan.nextInt();
		fourthM = scan.nextInt();
		fourthN = scan.nextInt();
		fifthNumber = scan.nextInt();
		sixthA = scan.nextInt();
		sixthB = scan.nextInt();
		sixthC = scan.nextInt();
		seventhNumber = scan.nextInt();
		eighthN = scan.nextInt();
		eighthA = scan.nextInt();
		ninthA = scan.nextInt();
		ninthB = scan.nextInt();
		ninthC = scan.nextInt();
		ninthM = scan.nextInt();
		ninthN = scan.nextInt();
	}
	
	public void firstTask()
	{
		if((firstNumber % 2) != 0)
		{
			show(false);
			return;
		}
		if(firstNumber < 10 && firstNumber > 99)
		{
			show(false);
			return;
		}
		show(true);
	}
	
	public void secondTask()
	{
		int array[] = new int[4];
		array = separation(secondNumber, 4);
		if((array[0] + array[1]) != (array[2] + array[3]))
		{
			show(false);
			return;
		}
		show(true);
	}
	
	public void thirdTask()
	{
		int array[] = new int[3];
		array = separation(thirdNumber, 3);
		if(((array[0] + array[1] + array[2]) % 2) != 0)
		{
			show(false);
			return;
		}
		show(true);
	}
	
	public void fourthTask()
	{
		if(fourthX >= fourthM && fourthX <= fourthN)
		{
			show(true);
			return;
		}
		show(false);
	}
	
	public void fifthTask()
	{
		int array[] = new int[3];
		array = separation(fifthNumber, 3);
		double square = Math.pow(fifthNumber, 2);
		double cube;
		cube = Math.pow((array[0] + array[1] + array[2]), 3);
		if(square != cube)
		{
			show(false);
			return;
		}
		show(true);
	}
	
	public void sixthTask()
	{
		if(sixthA == sixthB || sixthA == sixthC || sixthB == sixthC)
		{
			show(true);
			return;
		}
		show(false);
	}
	
	public void seventhTask()
	{
		int array[] = new int[3];
		array = separation(seventhNumber, 3);
		if((array[0] + array[1]) == array[2] || (array[0] + array[2]) == array[2] ||
				(array[2] + array[1]) == array[2])
		{
			show(true);
			return;
		}
		show(false);
	}
	
	public void eighthTask()
	{
		for(int i = 0;i <= 4;i++)
		{
			if(eighthN == Math.pow(eighthA, i))
			{
				show(true);
				return;
			}
		}
		show(false);
	}
	
	public void ninthTask()
	{
		int f;
		f = ninthA * ninthM * ninthM + ninthB * ninthM + ninthC;
		if(f == ninthN)
		{
			show(true);
			return;
		}
		show(false);
	}
	
	public int[] separation(int number, int kol)
	{
		int array[] = new int[4];
		for(int i = 0; i < kol; i++)
		{
			array[i] = number % 10;
			number /= 10;
		}
		return array;
	}
	
	public void show(boolean x)
	{
		System.out.println(x);
	}
}
