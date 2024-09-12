package Day_10;

public class Keyword 
{

	int x,y; //class variable/instance variable
	static int z=20;
	static String s="welcome";
	
	
	void setData(int x, int y)   //local variable
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x+" "+y);
	}

	public static void main(String[] args)
	{
		Keyword x= new Keyword();
		System.out.println(z);
		x.setData(15,56);
		x.display();
		
		Keyword.s.length();     // Similar to System.out.println
		1
		System.out.println(Keyword.s.length());
		
	}

}


