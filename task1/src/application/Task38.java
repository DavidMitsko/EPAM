package application;

import java.util.Scanner;

public class Task38 {
	private int xA;
	private int yA;
	private int xB;
	private int yB;
	private int xC;
	private int yC;
	
	Task38(Scanner scan)
	{
		xA = scan.nextInt();
		yA = scan.nextInt();
		xB = scan.nextInt();
		yB = scan.nextInt();
		xC = scan.nextInt();
		yC = scan.nextInt();
	}
	
	public void firstGraph()
	{
		if(xA < -4 || xA > 4 || yA < 0 || yA > 4)
		{
			show(false);
			return;
		}
		if(yA <= (xA + 4) || yA <= (-xA + 4))
			show(true);
	}
	
	public void secondGraph()
	{
		if((xB >= -4 && xB <= 4) && (yB <= 0 && yB >= -3))
		{
			show(true);
			return;
		}
		if((xB >= -2 && xB <= 2) && (yB >= 0 && yB <= 4))
		{
			show(true);
			return;
		}
		show(false);
	}
	
	public void thiordGraph()
	{
		if(xC < 0)
		{
			show(false);
			return;
		}
		if((xC*xC + yC*yC <= 16) && (xC >= 0 && xC <= 4) && (yC >= 0 && yC <= 4))
		{
			show(true);
			return;
		}
		if((xC*xC + yC*yC <= 25) && (xC >= 0 && xC <= 5) && (yC <= 0 && yC >= -5))
		{
			show(true);
			return;
		}
		show(false);
	}
	
	public void show(boolean x)
	{
		System.out.println(x);
	}
}
