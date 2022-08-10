package Programs;

import java.util.Arrays;

public class SecondLargestArrayElement {

	public static void main(String[] args) {
		//1st approach 
		//sort the elements by descending order & print the 2nd element
		 int ar[]= {1,5,8,6,2,8};
		 
		 for(int i =0; i<ar.length; i++) 
		 {
			 for(int j=i+1; j<ar.length; j++) 
			 {
				 if(ar[i]<ar[j]) 
				 {
					 int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
				 }
			 }
		 }

		 System.out.println(Arrays.toString(ar));
		 System.out.println(ar[1]);
		//2nd approach 
			
			int largest =Integer.MIN_VALUE;
			int second_largest = Integer.MIN_VALUE;
			
			for(int i=0 ; i<ar.length; i++) 
			{
				if(ar[i]>largest) 
				{
					largest=second_largest;
					largest=ar[i];
				}
				else if(ar[i]>second_largest && ar[i]!=largest) 
				{
					second_largest=ar[i];
				}
				
			}
			System.out.println(second_largest);
			
			
			
	}

	
}
