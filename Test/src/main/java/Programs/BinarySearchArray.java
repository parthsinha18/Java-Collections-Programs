package Programs;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50,60,70,90,80,100,45,20}; //it should be in sorted order
		Arrays.sort(ar);
		int key = 20;
		boolean flag = false;
		int l =0; //lower value
		int h=ar.length-1; //higher value
		
		while(l<=h)
	  {
			int m = (l+h)/2; //to find the mid value lower value +higher value divided by 2
			if(key==ar[m]) 
			{
				System.out.println("Element found ");
				flag = true;
				break;
			}
			if(key>ar[m]) 
			{
				l=m+1;
				
			}
			
			if(key<ar[m]) 
			{
				h=m-1;
			}
	 
	  }
		
		if(flag==false) 
		{
			System.out.println("Element not found ");
		}
	}

}
