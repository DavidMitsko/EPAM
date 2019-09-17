package application;

import java.util.Scanner;

public class Task30_1 {
	private String[] Rome = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", 
			"IV", "I" };
	private int[] Arab = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String rome;
	
	Task30_1(Scanner scan)
	{
		rome = scan.nextLine();
	}
	 
	public void RometoArab() 
	{
		StringBuffer romeNumber = new StringBuffer(rome);
		int arabNumber = 0, i = 0;
		if (romeNumber.length() > 0) 
		{
			while (true) 
			{
				do 
				{
					if (Rome[i].length() <= romeNumber.length()) 
					{
						if (Rome[i].equals(romeNumber.substring(0, Rome[i].length()))) 
						{
							arabNumber += Arab[i];
							romeNumber.delete(0, Rome[i].length());
							if (romeNumber.length() == 0) 
							{
								show(arabNumber);
								return;
							}
						} else
							break;
					} else
						break;
				} while (romeNumber.length() != 0);
				i++;
			}
		}
	}
	
	public void show(int m)
	{
		System.out.println(m);
	}
}
