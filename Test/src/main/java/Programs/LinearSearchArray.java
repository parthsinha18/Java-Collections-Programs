package Programs;

public class LinearSearchArray {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		int search_ar= 50;
		boolean flag = false;

		for(int i = 0 ; i<ar.length; i++) 
		{
			
			if(ar[i]==search_ar) 
			{
				System.out.println("Element found at index no" + i);
				flag=true;
				break;
				
			}
			
			
		}
		if(flag==false) 
		{
			System.out.println("Element not found ");
		}
		
		
	
		
	}

}
