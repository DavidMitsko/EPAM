/*
 * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
 */
package application;

public class Task16_1 {
	
	public void calculate()
	{
		long sum = 1 + 2;
		long mul = sum;
		for(int i = 3;i <= 10;i++)
		{
			sum = sum + i;
			mul = mul * sum;
		}
		show(mul);
	}
	
	public void show(long m)
	{
		System.out.println(m);
	}
}
