package Programs;

import javax.xml.stream.events.Characters;

public class String_Character_percentage {

	public static void charcterPercentage(String str) 
	{
		int upperCase=0;
		int lowerCase=0;
		int SpecialChar=0;
		int digit=0;
		
		int len = str.length();
		
		for(int i=0; i<len; i++) 
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) 
			{
				upperCase++;
			}
			else if(Character.isLowerCase(ch)) 
			{
				lowerCase++;
			}
			
			else if(Character.isDigit(ch)) 
			{
				digit++;
			}
			else 
			{
				SpecialChar++;
			}
			
		}
		
		System.out.println("Total no of upper case" + ((double)upperCase*100)/len);
		System.out.println("Total no of lower case" + ((double)lowerCase*100)/len);
		System.out.println("Total no of special character" + ((double)SpecialChar*100)/len);
		System.out.println("Total no of digit" + ((double)digit*100)/len);
	}
	
	
	public static void main(String[] args) {
		
		
		charcterPercentage("Parth1@$");
		

	}

}
