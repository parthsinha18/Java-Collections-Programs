package Programs;

public class AverageOfArray {

	public static void main(String[] args) {
		int ar[]= {1,5,8,50,100};
		int total = 0;
		for(int arr:ar) 
		{
			total = total +arr;
		}

		System.out.println(total);
		double average=  (total/ar.length);
		System.out.println(average);
		
	
	}

}
