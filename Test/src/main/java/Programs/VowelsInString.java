package Programs;

public class VowelsInString {
 public  static boolean vowels(char ch) {
	
	 return ch == 'a' || ch== 'e' || ch=='o' 
			||ch=='A' || ch=='O' || ch=='E';
 }
 
	
	
	public static void main(String[] args) {
		String str = "partohaaA";
		int count=0;
		for(int i =0 ; i<str.length(); i++) 
		{
			if(vowels(str.charAt(i))) 
			{
				
				count++;
				System.out.print(str.charAt(i));
			}
		}
		
		System.out.println("");
		
		System.out.println(count);

		//display only consonent 
		String s1 = "parthaaaaoe";
		char ch[] = s1.toCharArray();
		String res= "";
		for(int i =0; i<ch.length; i++) 
		{
			if(ch[i] != 'a' && ch[i] !='e' && ch[i] != 'o' && ch[i]!='i' && ch[i] !='u')
			res = res + ch[i];
			
			
		}
		
		System.out.println(res);
	}

}
