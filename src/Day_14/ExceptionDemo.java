package Day_14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		System.out.println("Program is started.............");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println(100/num);		//ArithmeticException if num=0
		System.out.println();

		System.out.println("Enter string to convert it into an Integer: ");
		String s=sc.next();
		int number=Integer.parseInt(s);
		
	}
	

}
