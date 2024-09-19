package Day_12;

interface Shape
{
	int length=10;
	int width=20;
	
	void circle();
	
	default void square()
	{
		System.out.println
		("this is a square.....(default method)");
	}
		
	static void rectangle() 
	{
			System.out.println("this is a rectangle.......(static method)");
		
	}
}



public class Interface_demo implements Shape
{
	public void circle() 		//to implement abstract method, public declaration is compulsory
	{
		System.out.println("this is a circle...... abstract method");
	}
	
	void triangle() 
	{
		System.out.println("this is a traingle...... abstract method");
	}
	
	public static void main(String[] args) 
	{
		
		//Scenario 1
		
		Interface_demo demo=new Interface_demo();
		demo.circle();
		demo.square();
		//demo.rectangle(); this will give error for static method
		Shape.rectangle();			//since this is a static method so we can directly access from Interface
		demo.triangle();
		
		//Scenario 2
		
		Shape sh=new Interface_demo();
		System.out.println("\n");
		sh.circle();
		sh.square();
		//sh.rectangle();		this will give error for static method
		Shape.rectangle();		//since this is a static method so we can directly access from Interface
		//sh.triangle();		We cannot access this method, since this is not from the interface
		System.out.println(sh.length*sh.width);
		System.out.println(Shape.length*Shape.width);
		
	

	}

}
