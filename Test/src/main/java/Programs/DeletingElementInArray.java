package Programs;

import java.util.Arrays;

public class DeletingElementInArray {

	public static void main(String[] args) {
		int ar[]= {10,30,45,100,500};
		int ele=45;
		int count =0;
		for(int i=0; i<ar.length; i++) 
		{
			if(ar[i]==ele) 
			{
				for(int j=i; j<ar.length-1; j++) 
				{
					ar[j]=ar[j+1];
				}
				count++;
				break;
			}
			
		}
		
		if(count==0) 
		{
			System.out.println("Element not found");
		}
		else 
		{
			System.out.println("Deleted succesfully ");
		}
		
		for(int i=0; i<ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}

	}

}
