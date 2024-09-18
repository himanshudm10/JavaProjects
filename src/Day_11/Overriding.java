package Day_11;

public class Overriding 
{
	
	class Bank
	{
		double roi()
		{
			return 0;
		}
	}

	class ICICI extends Bank
	{
		double roi()						
		{
			return 11.5;
		}
		
	}
	
	class SBI extends Bank
	{
		double roi() 
		{
		return 13;
		}
	}
}
