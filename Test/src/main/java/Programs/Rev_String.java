package Programs;

public class Rev_String {

	public static void main(String[] args) {
		
		String s1= "hello";
		String rev = "";
		
		for(int i=s1.length()-1; i>=0; i--) //extracting every character in reverse order from string
		{
			rev= rev + s1.charAt(i); //storing each character in a variable 
			
			
		}

	
		
		System.out.println(rev);
		
		//2nd approach
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		System.out.println("String buffer reverse = " + sb);
		
	}

}
