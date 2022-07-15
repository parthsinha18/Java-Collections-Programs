package Programs;

public class SwappingStringWithoutThirdVar {

	public static void main(String[] args) {
		String a ="Hello";
		String b = "World";
		
		
		
		a=a+b; //append whole helloworld inside a
		
		b=a.substring(0, a.length()- b.length()); //deleting world from helloworld by subtracting length a from b & storing inside b
		a=a.substring(b.length()); //storing only b inside a 
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
