package Programs;

import java.util.Arrays;

public class String_Anagram {

	public static boolean isAnagram(String s1 , String s2) 
	{
		
		
		String str1=s1.replaceAll("\\s","" ); //removing spaces
		String str2=s2.replaceAll("\\s", ""); //removing spaces
		if(str1.length()!=str2.length()) 
		{
			return false;
		}
		else 
		{
			char c1[] =str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
		
		
	}
	
	public static boolean anagram(String s1 ,String s2) 
	{
		String str1= s1.replaceAll("\\s", "");
		String str2= s2.replaceAll("\\s", "");
		if(str1.length()!=str2.length()) 
		{
			return false;
		}
		
		else 
		{
			char ch1[]=str1.toLowerCase().toCharArray();
			char ch2[]=str2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(isAnagram("Silent" , "Listen"));
		
		System.out.println(isAnagram("KEEP","peek"));
		System.out.println(anagram("Keep11" ,"PEEK14"));
	
		
		
	}
	


}
