/*
 * ���� �������� a. �� ��������� ������� ��������, ����� ���������, �������� �������� �^8 �� 
 * 3 �������� � �^10 �� ������.
 */
package application;

import java.util.Scanner;

public class Task27 {
	private int a;
	private int a_in_eighth;
	private int a_in_tenth;
	
	Task27(Scanner scan)
	{
		a = scan.nextInt();
	}
	
	public void value()
	{
		int a_in_second = a * a;
		int a_in_fourth = a_in_second * a_in_second;
		a_in_eighth = a_in_fourth * a_in_fourth;
		show(a_in_eighth);
		a_in_tenth = a_in_eighth * a_in_second;
		show(a_in_tenth);
	}
	
	public void show(int m)
	{
		System.out.println(m);
	}
}
