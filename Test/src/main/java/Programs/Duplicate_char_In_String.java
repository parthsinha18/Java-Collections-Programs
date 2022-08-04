package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_char_In_String {

	public static void duplicateString(String s) 
	{
		boolean flag = false;
		if(s==null) 
		{
			System.out.println("Null string");
			return;
		}
		if(s.isEmpty()) 
		{
			System.out.println("Empty String");
			return;
		}
		
		if(s.length()==1) 
		{
			System.out.println("Only one String");
			return;
		}
		
	
		
		else 
		{
			HashMap<Character,Integer> charmap = new HashMap<Character , Integer>();
			char words[]=s.toCharArray();
			
			for(char ch:words) 
			{
				if(charmap.containsKey(ch)) 
				{
					charmap.put(ch, charmap.get(ch)+1);
				}
				else 
				{
					charmap.put(ch, 1);
				}
				
			}
			
			Set<Map.Entry<Character,Integer>> entrySet =charmap.entrySet();
			for(Map.Entry<Character,Integer> entry:entrySet) 
			{
				if(entry.getValue()>1) 
				{
					flag=true;
					System.out.println(entry.getKey() +" : " + entry.getValue());
				}
				
				
			}
			
			
			if(flag==false) {
				System.out.println("No duplicate String");
			}
			
			
			
		}
		
		
	}
	public static void main(String[] args) {
		
		//duplicateString("Testiing");
		duplicateString(null);
		duplicateString("");
		duplicateString("a");
		duplicateString("aa");

	}

}
