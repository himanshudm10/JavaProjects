package Day_7;

import java.util.Scanner;

public class Palindrom 
{

	public static void main(String[] args) 
	{
		String reverse="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your word to find if they are Palindrom: ");
		String word=sc.next();
		
		char word1[]=word.toCharArray();
		for(int i=word1.length-1;i>=0;i--)
		{
			reverse=reverse+word1[i];
			
		}
		System.out.println("Word after reversing: "+reverse);
		if(word.toLowerCase().equals(reverse.toLowerCase()))
		System.out.println("\n"+"This is a Palindrom Word");
		else
		System.out.println("\n"+"This word is not a Palindrom");
	}

}
