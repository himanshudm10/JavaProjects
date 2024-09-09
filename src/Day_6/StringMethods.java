package Day_6;

import java.util.Scanner;

public class StringMethods 
{

	public static void main(String[] args)
	{
		
		String s="Woocome to Jxvx";
		System.out.println(s.charAt(3));
		System.out.println(s.replace("Woo", "wel").replace('x', 'a').toUpperCase());
		System.out.println(s.substring(0,2));

//Splitting string into parts using delimiter(example:'@','.')
		String x="abc@gmail.com";
		String y="abcxyz@gmail.com";
		String a[]= x.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);

//Removing commas and dollar from the String
		String money="$10,52,101";
		String moneytemp = (money.replace("$","" ).replace(",",""));
		
//Converting the money amount into Integer
		int amount=Integer.parseInt(moneytemp);
		System.out.println(3*amount);
		
//Taking name and Email as Input
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name and then Email"+"\n");
		String info=sc.next();
		
		String name[]=info.split(",");
		System.out.println("\n"+"Name: "+name[0]);
		System.out.println("\n"+"Email: "+name[1]);
	}

}
