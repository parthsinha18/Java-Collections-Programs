package Programs;

import java.util.Arrays;

public class InsertElementInArray {

	public static void main(String[] args) {
		int ar[]= {1,5,8,100,200};
		int index =2;
		
		for(int i = ar.length-1; i>index; i--) 
		{
			ar[i]=ar[i-1];
	
		}
		ar[index]=100;
		for(int i=0; i<ar.length; i++) 
		{
			System.out.println(ar[i]);
		}
		
	}
	
	

}
