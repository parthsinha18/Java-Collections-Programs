package Programs;

public class CountOfCapitalizedString {

	public static void main(String[] args) {
		String str ="Testing UpperCase";
		int count = 0;
		
		//1st approach by comparing capital characters
		/*
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)>='A' && str.charAt(i)<= 'Z') 
			{
				count++;
				System.out.println(str.charAt(i));
			}
		}
*/
		//System.out.println(count);
		
		//2nd approach using unicodes
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i)>=65 && str.charAt(i)<= 90) 
			{
				count++;
				System.out.println(str.charAt(i));
			}
			
			
		}
		System.out.println(count);
		
	
	}

}
