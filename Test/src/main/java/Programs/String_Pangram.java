package Programs;

public class String_Pangram {

	public static boolean isPanagram(String s) 
	{
		s.toLowerCase();
		
		if(s.length()<26) 
		{
			return false;
		}
		else 
		{
			
			for(char ch='a' ; ch<='z'; ch++) 
			{
				
				if(s.indexOf(ch)<0) 
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String s="A Quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s));
	      

	}

}
