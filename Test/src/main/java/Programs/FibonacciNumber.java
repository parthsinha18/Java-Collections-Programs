package Programs;

import java.util.Arrays;

public class FibonacciNumber {

	public static void main(String[] args) {
		
       int ar[]= {100,5,20,60,80};
       int n = ar.length;
       
       for(int i =0; i<n-1;i++) 
       {
    	   for(int j =i+1; j<n-1; j++) 
    	   {
    		   if(ar[j]>ar[j+1]) 
    		   {
    			   int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
    			   
    		   }
    	  
    	   }
    	  
       }
		
       System.out.println(Arrays.toString(ar));
		
	}
}
