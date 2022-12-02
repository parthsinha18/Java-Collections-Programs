package Programs;

public class ValidString {

	public static boolean validNum (String number) 
	{
		
		try 
		{
			Long.parseLong(number);
			System.out.println("valid number");
			
			
		}
		catch (Exception e)
		{
			System.out.println("not a valid number");
			return false;
		}
		return true;
	}
	
	public static boolean validPhno(String no) 
	{
		if(no.length()==10 && validNum(no)) 
		{
			System.out.println("Valid Number");
			return true;
			
		}
		System.out.println("Not a valid no ");
		return false;
	}
	
	public static void main(String[] args) {
		

		System.out.println(validNum("12345678912"));
		System.out.println(validPhno("1234567891a"));
		//System.out.println(validPhno(""));
	}

}
