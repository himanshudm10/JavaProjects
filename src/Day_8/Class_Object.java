package Day_8;

public class Class_Object {

	//Variables
	
	int eid;
	String ename;
	String job;
	int sal;
	
	
	//Methods
	
	void display()
	{
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(job);
	System.out.println(sal);
	}
	
	
	public static void main(String[] args) 
	{
		//Creating Objects
		Class_Object emp1=new Class_Object();
		emp1.eid=101;
		emp1.ename="Himanshu";
		emp1.job="Automation Tester";
		emp1.sal=58000;
		emp1.display();
		
		Class_Object emp2=new Class_Object();
		emp2.eid=102;
		emp2.ename="Anuj";
		emp2.job="Data Scientist";
		emp2.sal=90000;
		emp2.display();
	}

}
