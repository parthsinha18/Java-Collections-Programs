package Programs;

public class Missing_Array_Element {

	public static void main(String[] args) {
		//find out the missing element in array
		
		int arr[]= {1,2,3,4,6}; //here 5 is missing 
		 
		//Logic 
		/*
		 if we add  1+2 + 3 +4+6 =16
		 if we add the missing element 1+2+3+4+5+6=21
		 if we minus both we will get the missing element =21-16=5
		 we need to add all the array element in one loop
		 
		 
		*/
		int sum =0;
		for(int i=0; i<arr.length; i++) //it will fetch all the elements inside the array
		{
			sum = sum+arr[i]; // this will add all the array element and store it inside sum variable
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0; j<=6 ; j++) //then we should add all the numbers starting from 0 until last number
		{
			sum1=sum1+j;
		}

		System.out.println(sum1);
		
		//now we minus both the variable
		System.out.println("Missing element is = " + (sum1-sum));
		
	}

}
