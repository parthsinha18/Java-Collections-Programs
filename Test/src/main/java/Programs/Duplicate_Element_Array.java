package Programs;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Element_Array {

	public static void main(String[] args) {
		//Removing duplicate elements from the array 
		
		String arr[]= {"Java","Python","Ruby","c#","Java"};
		/*
		 Logic 
		 inside i we will get all the elements from the string array
		 inside nested for loop we will compare the 1st element with all the array element 
		 then the loop will run again for 2nd item until the array length 
		 then we will compare both the element using equals method if the element is found 
		 we will print the element
		 
		 
		 
		 */
		 
		
		
		
		for(int i=0; i<arr.length;i++) //in 0 index we have java string 
		{
			for(int j = i+1; j<arr.length; j++) //since j = i+1 that means j has python in 1st index 
				                                //then the loop will run again for 2nd element that is ruby and 3rd and 4th for c# 
				                                //in the 1st iteration and then it will go back to i for the 2nd element and i will have the 3rd element and will follow the same process 
			{
				if(arr[i].equals(arr[j])) //if any element is equal to java it will compare and print the element
				{
					System.out.println("Duplicate element " + arr[i]);
				}
			}
			
		}

		
		//2nd approach using hashset ::it stores unique value only
		Set<String> duplicate = new HashSet<String>();
		for(String name:arr) 
		{
			if(duplicate.add(name)==false) //since hashset does not store duplicate value 
			{
				System.out.println("Duplicate value " +name);
			}
		}
		
	
	}

}
