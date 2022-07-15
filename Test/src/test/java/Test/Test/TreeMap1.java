package Test.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		//tree map is red black tree implemenation
		//tree map sorts the element 
		//tree map maintain ascending order on basis of keys 
		
		TreeMap<Integer,String> map1 = new TreeMap<>();
		map1.put(1, "Abcd");
		map1.put(5,	 "b");
		map1.put(2,"c");
		
		System.out.println(map1); //it will print the keys in ascending order
		Set<Integer> lessthan = map1.headMap(2).keySet();//this will print keys less than 2
		System.out.println(lessthan);
		
		Set<Integer>morethan =map1.tailMap(1).keySet(); //it will print keys greater than 1
		System.out.println(morethan);
		
	   Iterator<Integer> it =map1.keySet().iterator();
	   
	   while(it.hasNext()) 
	   {
		   Integer key = (Integer) it.next(); //type casting because it is a wrapper class data type(non primitive)
		   String value = map1.get(key);
		   
		   System.out.println("Keys are "  + key + " Values are " + value);
		   
	   }
	   
	   //for reverse order 
	   
	   TreeMap<Integer,String> map2= new TreeMap<>(Comparator.reverseOrder()); //just add comparator.reverse
		map2.put(1, "Abcd");
		map2.put(5,	 "b");
		map2.put(2,"c");
		System.out.println(map2);
		//using stream java 8 
		
		map2.forEach((k,v) -> System.out.println(k+v));
		
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("abc");
		ar.add("Parth");
		ar.add("fdsa");
		ar.add("avcd");
		
		Object[] arr  =ar.toArray();
		for (Object ob : arr) 
		{
			System.out.println(ob.toString());
		}
		
		
	}

	
}
