package Day_14;

import java.util.Scanner;

public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		System.out.println("Program is started.............");
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		String s=null;
		try
		{
		System.out.println(100/num);		//ArithmeticException if num=0
		}
		catch(Exception e)
		{
			System.out.println("Invalid Data: "+e.getMessage());
		}
		
		
		try
		{
			System.out.println(s.length());		//NullPointerException
		}
		catch(Exception e)
		{
			System.out.println("Invalid Data: "+e.getMessage());
		}
				
		finally
		{
			System.out.println("\n"+"You entered into 'finally' block");
		}
		
		
		System.out.println("Program is completed........");
	}
}
