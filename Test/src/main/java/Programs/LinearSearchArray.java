package Programs;

public class LinearSearchArray {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		int search_ar= 50;
		boolean flag = false;

		for(int i = 0 ; i<ar.length; i++) 
		{
			System.out.println(ar[i]);
			if(search_ar==ar[i]) 
			{
				System.out.print("Element found at index no" + i);
				flag=true;
				break;
				
			}
			
			
		}
		if(flag==false) 
		{
			System.out.println("ELement not found ");
		}
	}

}