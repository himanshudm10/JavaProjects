package Day_7;
import java.util.Scanner;
public class Removing_White_Space 
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to count the characters");
		String st=sc.next();
		char word[]=st.toCharArray();
		for(int i=0;i<word.length;i++)
		{
			count++;
		}
		System.out.println("The word you entered is "+st+" and there are "+count+" characters");
	}
}
