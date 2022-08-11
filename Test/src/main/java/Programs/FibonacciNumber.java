package Programs;


public class FibonacciNumber
{
	static int a=0;
	static int b=1;
	static int c;
	
	public static void fib(int i) 
	{
		
		if(i>1) 
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			fib(i-1);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
	
		System.out.println(a);
		System.out.println(b);
		fib(10);
		


		/*
		
		int a=0;
		int b=1;
		System.out.print(a + "  " + b);
		
		int c;
		for( int i=1 ; i<10; i++)
		{
			c=a+b;
			System.out.println(" "+ c + " ");
			a=b;
			b=c;
			
		}
		*/
		
	}
}
