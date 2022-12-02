package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordCountInString {

	public static void duplicate(String str) 
	{
		boolean flag = false;
		String words[]=str.split(" ");
		
		Map<String , Integer> wordcount = new HashMap<String, Integer>();
		
		
		for(String word:words)
		{
			if(wordcount.containsKey(word)) 
			{
				wordcount.put(word, wordcount.get(word)+1);
			}
			else 
			{
				wordcount.put(word, 1);
			}
			
		}
		
		Set<String> dword =wordcount.keySet();
		for(String word:dword)
		{
			if(wordcount.get(word)>1) 
			{
				flag = true;
				System.out.println("Duplicate word is " +word + " : "+ wordcount.get(word));
			}
			
		}
		if(flag==false) 
		{
			System.out.println("No duplicate elements");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		duplicate("Java  is a programming language Java ");

	}

}
