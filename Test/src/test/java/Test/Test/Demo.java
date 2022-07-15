package Test.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Demo {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Parth");
		ar.add("abcde");
		ar.add("abvads");
		ar.add("dgfgdf");
		
		Iterator<String> it = ar.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}

		for(int i=0 ;i<ar.size(); i++) 
		{
			System.out.println(ar.get(i));
		}
		
		for(String st:ar) 
		{
			System.out.println(st);
		}
		
		boolean cs=ar.contains("Parth");
		System.out.println(cs);
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		//ar2.removeIf(num -> num%2==0);
		//System.out.println(ar2);
		ar2.removeIf(num -> num%2==0);
		System.out.println("Odd no." + ar2); //using lamda expression
		
		ArrayList<Integer> cloneList = (ArrayList<Integer>)(ar2.clone());
		//cloning two array list 
		System.out.println("Clone list = " + cloneList);
		
		//converting arraylist into the homgeneous array
		try {
			
		Object arr [] =ar2.toArray();
	     for(Object arr1: arr) 
	     {
	    	 System.out.println("Array is  " +arr1);
	    	 
	     }
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		 ar3.retainAll(ar3);
		 System.out.println("retain all" +ar3);
		 
		
		ArrayList<Integer> subList = new ArrayList<Integer>(ar3.subList(2, 6));
		System.out.println(subList);
		//sublist will exclude the last index
		System.out.println(ar3.indexOf(5));
		
		//removing duplicate elements from the array list & printing into the array list  
		ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,7,7,8,8,8,9,9,10,10));
		LinkedHashSet<Integer> linked = new LinkedHashSet<Integer>(ar4); //pass the arraylist as a constructor into linked hash set
		//linked hashset does not support duplicate values 
		
		ArrayList<Integer> withoutDuplicate = new ArrayList<Integer>(linked);//then create another arraylist and pass the linked list as a constructor
		//now it will only print the unique values 
		System.out.println("without duplicate " + withoutDuplicate); 
		
		//comparing two arraylist 
		
		ArrayList<String> li = new ArrayList<String>(Arrays.asList("a","b","d","c","e" ));
		ArrayList<String> li2 = new ArrayList<String>(Arrays.asList("b","a","c","d","E"));
		
		Collections.sort(li);
		Collections.sort(li2);
		System.out.println(li);
		System.out.println(li2);
	
		boolean pr=li.equals(li2);
		System.out.println(pr);
		//li2.removeAll(li);
		//System.out.println(li2);
		
		li.retainAll(li2);
		System.out.println(li);
		
		
		
		
		
		
	}

}
