package Day_7;

public class Character_Occurence {

	public static void main(String[] args) {

		String str="Hello";
		int x=1;
		char word[]=str.toCharArray();
		
		int len=str.length()-1;
		
		
			for(int i=0;i<=len;i++)
			{
				
				for(int j=i+1;j<len;j++)
				{
					if(word[i]==word[j])
						x++;
				}
				System.out.println(word[i]+" "+x);
			}
			
		
	}

}
