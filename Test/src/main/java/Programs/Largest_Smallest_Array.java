package Programs;

import java.util.Arrays;

public class Largest_Smallest_Array {

	public static void main(String[] args) 
	{
		
		/*
		 we will store the 0 index element inside one smaller & larger variable 
		 since we have stored 0th index element so we do not need iterate from 0
		 we will start iterating from 1 and if any value inside the loop is greater than the 0th index it will store the value in largest variable 
		 else it will compare the smallest value and if the number is smaller it will store inside smaller variable, it will repeat until all the elements are compared 
		 		 */
		int numbers[]= {5,2,3,4,5,6};
		int largest=numbers[0];
		int smallest = numbers[0];
		
		for(int i=1 ;i<numbers.length; i++) //for 1st element we have 2 if 2 larger than it will store for the 1st time
			//and it will iterate once again if 2 greater than 3 it will store the element until it iterates all the element
			//if element is smaller it will be stored inside the inside smaller variable 
		{
			if(numbers[i]>largest) 
			{
				largest=numbers[i];//6
				
			} 
			else if(numbers[i]<smallest) 
			{
				smallest=numbers[i];//2
			}
				
		}	
			
				
			
		System.out.println(Arrays.toString(numbers));
		System.out.println("Smallest no " + smallest);
		System.out.println("Largest no" + largest);
		
	}
}
