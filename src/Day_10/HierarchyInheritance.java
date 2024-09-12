package Day_10;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}


class Child1 extends Parent
{
	void print(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void show(int c)
	{
		System.out.println(c);
	}
}



public class HierarchyInheritance {

	public static void main(String[] args) 
	{

		Child2 c=new Child2();
		c.display(5);
		c.show(56);
		
		Child1 b=new Child1();
		b.print(21);
	}

}
