package Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Using_Loop 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Number for Position "+i+": ");
			a[i]=sc.nextInt();			
		}
		System.out.println("Numbers You Entered: ");
		System.out.println(Arrays.toString(a));
		
		
//Sorting in Ascending Orders
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					int store=a[i];
					a[i]=a[j];
					a[j]=store;
				}
			}
			    
		}
		System.out.println("Numbers Sorted In Ascending Order: ");
		System.out.println(Arrays.toString(a));
		
		
//Sorting in Descending Orders

		for(int k=0;k<a.length;k++)
		{
			for(int l=k+1;l<a.length;l++)
			{
				if(a[l]>a[k])
				{
					int cache=a[k];
					a[k]=a[l];
					a[l]=cache;
				}
			}
			    
		}
		System.out.println("Numbers Sorted In Descending Order: ");
		System.out.println(Arrays.toString(a));
	}

}
