package Programs;



public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "Parth sarthi";
		String a[]= str.split(" "); 
		for(int i=a.length-1; i>=0; i--) 
		{
			System.out.print(a[i] + " ");
		}

		
	}

}
