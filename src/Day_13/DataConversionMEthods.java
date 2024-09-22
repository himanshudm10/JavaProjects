package Day_13;

public class DataConversionMEthods 
{

	public static void main(String[] args)
	{
		
		
		String s1="12345";
		String s2="23";
		System.out.println(s1+s2);
		
		//String TO Integer
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

		//String TO Double
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		String s="True";
		String st="Selenium";			//other than true, if you pass any string it will return false after conversion to Boolean
		
		//String TO Boolean
		System.out.println(Boolean.parseBoolean(s));
		System.out.println(Boolean.parseBoolean(st));

		//int, double, float, boolean and char TO String
		int i=10;
		double d=10.5;
		boolean b=true;
		char c='h';
		
		String si=String.valueOf(i);
		String sd=String.valueOf(d);
		String sb=String.valueOf(b);
		String sc=String.valueOf(c);
		
		System.out.println("Integer: "+si+"  Double: "+sd+"  Boolean: "+sb+"  Char: "+sc);
	}
	
}