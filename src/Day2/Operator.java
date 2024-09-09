package Day2;

public class Operator
{

	public static void main(String[] args) 
	{
	
		int a=10, b=12;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		a*=2;
		System.out.println(a);
		a/=2;
		System.out.println(a);
		int x=(a>b)? a:b; //Ternary Operator
		System.out.println(x);
	}

}
