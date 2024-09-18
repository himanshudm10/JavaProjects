package Day_11;

class AllAnimal
{
	String color="white";
}

class Dog extends AllAnimal
{
	String color="black";
	void displaycolor()
	{
		System.out.println(super.color);
	}
}





public class Animal 
{

	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.displaycolor();
	}

}
