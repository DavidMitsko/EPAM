/*
 * � ���������� ����� ���������� ������� �����. ����� ���������� ����� �������� �� 7, �� ��������
 * �������� �����. ����� ��� �����
 */
package application;

public class Task39_1 {
	private int number;
	
	public void find()
	{
		int jong;
		for(number = 100; number <= 999; number++)
		{
			jong = number % 100;
			if(jong * 7 == number)
				show(number);
		}
	}
	
	public void show(int x)
	{
		System.out.println(x);
	}
	
}
