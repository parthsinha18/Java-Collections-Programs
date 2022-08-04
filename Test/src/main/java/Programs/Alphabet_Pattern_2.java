package Programs;

public class Alphabet_Pattern_2 {

	public static void main(String[] args) {
		
		int alpha=65;
		System.out.println("3rd Pattern");
		for(int i=0; i<=5; i++) 
		{
			for(int j=0;j<=i; j++) 
			{
				System.out.print((char)(alpha+i)+ " ");
			}
			System.out.println("");
		}
		
		int alph = 65;
		System.out.println("Reverse");
		for(int i=0; i<=5; i++) 
		
		{
			for(int j=i; j<=5; j++) 
			{
				System.out.print((char)(alph+i) + " ");
			}
			System.out.println("");
		}
		
	

		
		
		
		
	}

}
