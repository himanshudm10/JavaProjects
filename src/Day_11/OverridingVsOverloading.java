package Day_11;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}


class XYZ extends ABC
{
	void m1(int a)						// Overriding
	{
		System.out.println(a*a);
	}

	void m2(int a, int b)				// Overloading
	{
		System.out.println(a+b);
		
	}
}













public class OverridingVsOverloading 
{
	
	
	
}
