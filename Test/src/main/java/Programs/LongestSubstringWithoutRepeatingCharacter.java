package Programs;


import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void longest(String s) 
	{
		String LongestSubstring=null;
		int longestSubstringLength=0;
		
		Map<Character , Integer> map = new LinkedHashMap<Character, Integer>();
		char [] arr =s.toCharArray();
		for(int i=0; i<arr.length; i++) 
		{
			char ch= arr[i];
			if(!map.containsKey(ch)) 
			{
				map.put(ch, i);
			}
			else 
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>longestSubstringLength) 
			{
				longestSubstringLength=map.size();
				LongestSubstring=map.keySet().toString();
			}
		}
				
		
		System.out.println("Longest substring length " + longestSubstringLength);
		System.out.println("Longest substring " + LongestSubstring);
		
	}
	
	public static void main(String[] args) {
		

		longest("abccccc");
		
	}

}
