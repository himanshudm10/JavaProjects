package Day_7;

import java.util.Scanner;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		String reverse="";
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word to reverse: ");
		String word=sc.next();
		for(int i=(word.length()-1);i>=0;i--)
		{
			char word1=word.charAt(i);
			reverse=reverse+word1;
			
		}
		System.out.println("Reverse String using String Methods: "+reverse);
		

//Reversing String without using String Methods
			
		char a[]=word.toCharArray();
		for(int i=(a.length-1);i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String w/o String Methods: "+rev);

		
//Reversing String using in-Built functions
		
		StringBuilder s=new StringBuilder(word);
		System.out.println("Reversing String using StringBuilder: "+s.reverse());
		
		StringBuffer y=new StringBuffer(word);
		System.out.println("Reversing String using StringBuilder: "+y.reverse());
		
	}

}
