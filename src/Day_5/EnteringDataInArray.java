package Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class EnteringDataInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Number for Position "+i+": ");
			a[i]=sc.nextInt();			
		}
		System.out.println("Numbers You Entered: ");
		System.out.println(Arrays.toString(a));
		
		