package Day_4;

public class SearchElementArray 
{

	public static void main(String[] args)
	{

		int a[]= {10,20,30,40,50};
		int search_element=60;
		boolean status=false;			//Means Not Found
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element Found, Its "+search_element);
				status=true;
				break;
			}
		}
		if(status==false)
			System.out.println("Element Not Found");
	}

}
