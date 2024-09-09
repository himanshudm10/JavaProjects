package Day_4;

public class SearchDuplicateArray 
{

	public static void main(String[] args) 
	{
		
		int a[]= {10,10,20,30,40,40,10,50};
		int count=0;
		int element=40;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
				count++;
		}
		System.out.println("Number of Repitition Using First Method "+count);
	

	
	//Alternate Logic
	
	int repitition=0;
	for(int value:a)
	{
		if(value==element)
			repitition++;
	}
	System.out.println("Number of Repitition Using Second Method "+repitition);
	
	}
}
	
	
