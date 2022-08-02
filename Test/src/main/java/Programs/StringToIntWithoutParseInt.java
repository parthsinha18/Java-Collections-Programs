package Programs;

public class StringToIntWithoutParseInt {

	//Using unicodes
	public static int string(String str) 
	{
		int num=0;
		int len = str.length();
		for(int i=0; i<len; i++) 
		{
			num=num*10 +( (int)(str.charAt(i)) - 48); //type cast to integer & minus with unicode of 0;
			//unicode of 1 is 49, 49-48=1 and store it num and then do the  same for the next value
		}
		return num;
	}
	
	public static void main(String[] args) {
		

		String s ="35252";
		System.out.println(string(s)+10);
				
	}

}
