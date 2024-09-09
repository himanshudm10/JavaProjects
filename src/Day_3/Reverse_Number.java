package Day_3;
import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to reverse the digits ");
		int x=sc.nextInt();
		System.out.println("The Number you entered "+x);
		int number=0,digit;
				
		while(x>0)
		{
			digit = x%10;
			number= (number*10)+digit;
			x=x/10;
		}
		System.out.println("After we reversed the digits, Number= "+number);
		
	}
}
