package Day_4;

import java.util.Arrays;

public class SortingElementsInArrays 
{

	public static void main(String[] args) 
	{
		int a[]= {10,40,10,20,30,40,40,10,50};
		System.out.println("Before Sorting: ");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(a));
		
	}

}
