package Programs;

import java.util.HashMap;
import java.util.Map;

public class Rev_String {

	
	public static void main(String[] args) {
		
		String s1= "hello";
		String rev = "";
		
		for(int i=s1.length()-1; i>=0; i--) //extracting every character in reverse order from string
		{
			rev= rev + s1.charAt(i); //storing each character in a variable 
			
			
		}

	
		
		System.out.println(rev);
		
		if(rev.equals(s1)) 
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
		//2nd approach
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.out.println("String buffer reverse = " + sb);
		
		String str= "hello reverse";
		System.out.println(str);
		String rev2 ="";
		str.split(" ");
		for(int i=str.length()-1; i>=0; i--) 
		{
			rev2=rev2 +str.charAt(i);
		}
		
		System.out.println(rev2);
		
	
		}
	
	

	
	
	}
	
