package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Strings 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in); 
		String a[]= new String[5];
		for(int n=0;n<a.length;n++) 
		{
			System.out.println("Enter Word in the List: ");
			a[n]=sc.next();
		}
		System.out.println("You entered WORDS in this order: ");
		System.out.println(Arrays.toString(a));
		

//Sorting in Ascending Order(a-z)
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[i])<0)
				{
					String temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
			    
		}
		System.out.println("\n"+"List in (a-z) Order: ");
		System.out.println(Arrays.toString(a));
		
		
//Sorting in Descending Order(z-a)
		
		for(int k=0;k<a.length;k++)
		{
			for(int m=k+1;m<a.length;m++)
			{
				if(a[m].compareTo(a[k])>0)
				{
					String temp2=a[k];
					a[k]=a[m];
					a[m]=temp2;
				}
			}
			    
		}
		System.out.println("\n"+"List in (z-a) Order: ");
		System.out.println(Arrays.toString(a));
	}

}
