package Day_10;

class A
{
int a=100;
void display()
{
	System.out.println(a);
}
}

class B extends A
{
	int b=20;
	void show() {
		System.out.println(b);
	}
}


class C extends B
{
	int c=20;
	void print() 
	{
		System.out.println(c);
	}
}

public class Inheritance 
{
	public static void main(String[] args)
	{
		C bobj=new C();
		bobj.show();
		bobj.display();
		bobj.print();
	}
}
