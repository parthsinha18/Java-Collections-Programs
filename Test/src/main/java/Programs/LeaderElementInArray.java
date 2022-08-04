package Programs;

public class LeaderElementInArray {

	public static void leader(int num[]) 
	{
		int max= num[num.length-1];
		System.out.print("Leader elements are: " +max + " ");
		for(int i = num.length-2; i>=0; i--) 
		{
			if(num[i]>max) 
			{
				System.out.print(num[i] + " ");
				max=num[i];
				
			}
		}
	}
	public static void main(String[] args) {
		int num1[]= {92,8,1,3,5,3};
		leader(num1);
		
		
	}

}
