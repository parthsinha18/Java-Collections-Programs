package Programs;

public class Junk_Element {

	public static void main(String[] args) {
		String str = "$$$$ Parth";
		
		String s = str.replaceAll("[^a-zA-Z0-9]", "");//this expression will remove all the characters except a-z,A-Z,0-9
		System.out.println(s);
		
		

	}

}
