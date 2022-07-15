package Programs;

public class Swapping_Without_Thirdvar {

	public static void main(String[] args) {
		int x =5;
		int y=10;
		
		x=x+y; //x+y = 15;
		y=x-y;//x-y = 15-10 = 5 - swapped
		x=x-y; //15-5 =10 - swapped
		
		System.out.println("before swapping");
		System.out.println("x is :" +x);
		System.out.println("y is :" +y);
		
		
		System.out.println("after swapping");
		System.out.println("y is :" +y);
		System.out.println("x is " +x);

	}

}
