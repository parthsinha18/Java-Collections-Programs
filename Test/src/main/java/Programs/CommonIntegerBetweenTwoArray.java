package Programs;

public class CommonIntegerBetweenTwoArray {

	public static void main(String[] args) {
		int ar[]= {5,8,3,1,6};
		int ar1[]= {2,4,7,6};
		
		for(int i=0; i<ar.length; i++) 
		{
			for(int j=0; j<ar1.length;j++) 
			{
				if(ar[i]==ar1[j]) 
				{
					System.out.println("Common Element in two arrays are : " + ar1[j]);
				}
			}
		}
		int ar2[]= {5,8,2,36,4};
		int ar3[]= {10,8,5,25,5};
		for(int i=0; i<ar2.length; i++) 
		{
			for (int j=0; j<ar3.length; j++) 
			{
				if(ar2[i]==ar3[j]) 
				{
					System.out.println(ar[i]);
				}
			}
		}

	}

}
