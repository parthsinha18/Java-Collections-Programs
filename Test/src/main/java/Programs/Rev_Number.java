package Programs;

public class Rev_Number {

	
	public static void main(String[]args)
	{	int num = 74123;
	    int rev =0;
			
	
	while(num!=0) 
	{
		
		rev =rev*10 + num%10;
		//num%10 will give the remainder and we will store that remainder in the rev variable
		num = num/10;
		//num/10 will give eliminate the last number and will continue the loop until elements gets to 0
		
		
	}

	System.out.println(rev);
	//2nd approach 
		int num1=12345;
		 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		 
		 
	}
	
	

	
}
	
