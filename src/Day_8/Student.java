package Day_8;

import java.util.Scanner;

public class Student {
	
	int sid;
	String sname;
	char sgrade;
	Scanner sc=new Scanner(System.in);
	//	- Using object reference variables (stu.sid=101;)

	void printstu_data()
	{
		System.out.println(sid+"  "+sname+"  "+sgrade);
	}
	
	
	//Using method (within the same class)
	void setstu_data(int id, String name, char gr) 
	{
		sid=id;
		sname=name;
		sgrade=gr;
	}
	
	//Using Constructor-- Only to initializing data and nothing else; no loop; no logic; never return a value
	/*Student(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		sgrade=gr;
	}*/
	
	
	void getdata()
	{
		System.out.println("Enter Student Id");
		sid=sc.nextInt();
		System.out.println("Enter Student Name");
		sname=sc.next();
		System.out.println("Enter Student Grade");
		sgrade=sc.next().charAt(0);
	}
}
