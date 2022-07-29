package Programs;

public class PyramidPattern {

	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++) 
		{
			for(int j=10; j>=i; j--) 
			{
				System.out.print(" "); // for empty spaces
				
				
			}
			for(int k=1; k<=i; k++)  
			{
				System.out.print(" *"); //extra space is for spaces between the stars
			}
			System.out.println("");
		}
		
		//reverse
		
		for(int i=1; i<=10; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" "); // for empty spaces
				
				
			}
			for(int k=10; k>=i; k--)  
			{
				System.out.print(" *"); //extra space is for spaces between the stars
			}
			System.out.println("");
		}
	}
}
