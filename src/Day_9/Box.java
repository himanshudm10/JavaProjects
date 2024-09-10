package Day_9;

import java.util.Scanner;

public class Box 
{
	double width, height, length;
	Scanner sc=new Scanner(System.in);
	
	void box()
	{
		System.out.println("Enter Width");
		width= sc.nextDouble();
		System.out.println("Enter Height");
		height= sc.nextDouble();
		System.out.println("Enter Length");
		length=sc.nextDouble();
		double volume=width*length*height;
		System.out.println("Volume= "+volume);
	}
	
	void box(double l, double w, double h)
	{
		double volume=l*w*h;
		System.out.println("Volume= "+volume);
	}
}
