package Day_12;

class Class2
{
	void m3()
	{
		System.out.println("This is class2 method");
	}
}


public class Class1 extends Class2 implements Interface1, Interface2			//Hybrid Inheritance
{
	
	public void m1() {
		System.out.println(x);
	}
	
	
	public void m2()
	{
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		
		Class1 c1= new Class1();
		c1.m1();
		c1.m2();
		c1.m3();
		
	}

}
