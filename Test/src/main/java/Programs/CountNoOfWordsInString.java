package Programs;

public class CountNoOfWordsInString {

	public static void main(String[] args) {
		//extract all the characters from the string 
		//if string has a space & after the space (i+1) there is another character
		//then it would be count as word 
		//if both the conditions are satisfied just increase the count variable 
		
		
		
		String s = "total no of words";
		int count = 0;
		for(int i = 0 ; i<s.length(); i++) 
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
				
			}
			
		} 

		System.out.println("Total no of words in a string = " +count);
		
		String s1 = "Total no    of words";
		System.out.println(s1.length());
		int count1 =1;
		for(int i=0; i<s1.length(); i++) 
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1) != ' ') 
			{
				count1++;
			}
		}
		System.out.println("Total no of count " + count1);
	}

}
