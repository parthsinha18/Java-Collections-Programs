package Programs;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		for(int i=0; i<=5; i++) 
		{
			for(int j=0; j<=i; j++) 
			{
				
				System.out.print((char)(alpha+j) + " ");
			}
			System.out.println(" ");
		}
		
		
		
		System.out.println("--------------");
		
		int alpha_2= 65;
		for(int i=0; i<=5; i++) 
		{
			for(int j=i; j<=5; j++) 
			{
				System.out.print((char)(alpha_2+j) + " ");
			}
			System.out.println(" ");
		}
		
		
	}

}
