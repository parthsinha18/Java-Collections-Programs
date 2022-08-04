package Programs;

public class RemovingDuplicatesFromArray {

	public static void main(String[] args) {
		//sorted array
		int ar[]= {1,2,2,3,4,5,5,6,6,7,8};
		int temp[] = new int[ar.length];
		int j=0;
		for(int i=0; i<ar.length-1;i++) 
		{
			if(ar[i]!=ar[i+1]) 
			{
				temp[j]=ar[i];
				j++;
			}
		}

		temp[j] =ar[ar.length-1]; 
		
		System.out.println("after");
		for(int i=0; i<temp.length; i++) 
		{
			System.out.print(temp[i]);
		}
	}

}
