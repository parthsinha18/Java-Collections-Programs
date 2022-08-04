package Programs;

public class LargestConsecutiveSumOfArray {

	public static void main(String[] args) {
	
		int ar[]= {40,50,70,10,40};

		int cons = ar[0]+ar[1];
		for(int i=1; i<ar.length-1; i++) 
		{
			if(cons<ar[i]+ar[i+1]) 
			{
				cons= ar[i] +ar[i+1];
				
			}
		}
		System.out.println("Largest consecutive sum is : " + cons);
	}
	

}
