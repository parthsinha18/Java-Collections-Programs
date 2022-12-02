package Programs;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		//logic
		//it will check the 1st element with the 2nd element if the element is greater then it will swap the element 
		//ex- if there is 5 element then for every element there will be 4 passes to check every element with each other
		//no of passes is will be n-1 since there is no need to because last element will already be sorted
		
		int ar[]= {4,1,5,3,6};
		int n = ar.length;
		System.out.println("Array before sorting" + Arrays.toString(ar));
		
		for(int i =0; i<n-1; i++) //1st loop is for no of passes
		{
			for(int j=0; j<n-1; j++) //2nd loop is to check every element with each other 
			{
				if(ar[j]>ar[j+1]) //if element is greater than swap the elements
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
				
		}

		System.out.println("Array after sorting" + Arrays.toString(ar));
		
		
		String str="parth";
		char ch[]=str.toCharArray();
		int n2 = ch.length;
		for(int i=0;i<n2-1;i++) 
		{
			for(int j=0; j<n2-1;j++) 
			{
				if(ch[j]>ch[j+1]) 
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting" + Arrays.toString(ch));
		
	
		int arr[] = {4,5,8,3,5};
		int len = arr.length;
		for(int i=0; i<len-1; i++) 
		{
			for(int j=0; j<len-1; j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		String s1 = "testing";
		char ch1[]=s1.toCharArray();
		int len1 = ch1.length;
		System.out.println(ch1.length);
		
		for(int i=0; i<len1-1; i++) 
		{
			for(int j=0 ; j<len1-1 ; j++) 
			{
				if(ch1[j]>ch1[j+1]) 
				{
					char temp = ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch1));
	
	}
	
	
	

}
