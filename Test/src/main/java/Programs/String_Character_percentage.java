package Programs;



public class String_Character_percentage {
//percentage of uppercase , lowercase , special character & digit in the string
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
	
	public static void percent1(String s2) 
	{
		int len = s2.length();
		int uppercase = 0;
		int lowercase = 0;
		int digit = 0;
		int specialChar=0;
		
		for(int i=0; i<len; i++) 
		{
			char ch = s2.charAt(i);
			if(Character.isUpperCase(ch)) 
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch)) 
			{
				lowercase++;
			}
			else if(Character.isDigit(ch)) 
			{
				digit++;
			}
			else 
			{
				specialChar++;
			}
		}
		
		System.out.println((double)(uppercase*100/len));
		System.out.println((double)(lowercase*100/len));
		System.out.println((double)(digit*100/len));
		System.out.println((double)(specialChar*100/len));
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		charcterPercentage("Parth1@$");
		percent1("Parth525%$!@#$");
		

	}

}
