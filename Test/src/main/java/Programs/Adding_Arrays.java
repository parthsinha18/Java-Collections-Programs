package Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Adding_Arrays {

	public static void main(String[] args) {
		String ar[]= {"a" , "b", "c"};
		String ar2[]= {"d","e","f"};
		
		Stream<String> str = Arrays.stream(ar);
		Stream<String> str2= Arrays.stream(ar2);
		String array[] = Stream.concat(str, str2 ).toArray(size -> new String[size]);
		System.out.println(Arrays.toString(array));

	}

}
