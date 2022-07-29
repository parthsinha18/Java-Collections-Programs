package Programs;

public class StarPattern_1 {

	public static void main(String[] args) {
		

		//Triangle
		
		System.out.println("1st Pattern");
		for(int i=1; i<=5; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("2nd Pattern");
		//Reverse Triangle
		for(int i=1; i<=5;i++) 
		{
			for(int j=5; j>=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("3rd Pattern");
		
		//combination
		for(int i =1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
		
		for(int i=1; i<=5; i++) 
		{
			for(int j=4; j>=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	

}
