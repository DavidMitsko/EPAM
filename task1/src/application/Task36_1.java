/*
 * Два двухзначгых числа, записанных один за другим, образуют четырёхзначное число,
 * которое делиться на их произведение. Найти эти числа.
 */
package application;

public class Task36_1 {
	private int number;
	
	public void check()
	{
		int old;
		int jong;
		for(number = 1000; number <= 9999; number++)
		{
			old = (int)number/100;
			jong = number % 100;
			if(old == 0 || jong == 0)
				continue;
			if((number % (old * jong)) == 0)
			{
				show(old,jong);
			}
		}
	}
	
	public void show(int x, int y)
	{
		System.out.println(x + " " + y);
	}
}
