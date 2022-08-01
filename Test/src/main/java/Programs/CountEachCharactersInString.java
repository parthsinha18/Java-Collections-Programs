package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharactersInString {
	
	public static void  characters(String name) 
	{
		
		
		Map<Character ,Integer> charmap = new HashMap<Character , Integer>();
		
		char strArray[]=name.toCharArray(); //converting all the string into character array
		for(char c:strArray) //iterating arrays
		{
			if(charmap.containsKey(c)) //if characters already exists
			{
				charmap.put(c, charmap.get(c)+1); //add count to + 1
			}
			else 
			{
				charmap.put(c, 1); //else count will be 1 
			}
		}
		
		System.out.println("Total no of characters" +charmap); 

	}
	
	public static void main(String[] args) {
	characters("Testingg");
	characters(" spaces between words ");
	
	}
	}

	
	
	
	
	
	
	

