package Test.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		//hashmap does not accept duplicate value , it will only print the new value 
		//it accepts key and value 
		//there can only be one null key , if there is more than it will print the new null key value 
		
		HashMap<String,String>  map = new HashMap<String,String>();
		map.put("India", "Delhi");
		map.put("abc", "Delhi");
		map.put(null, "France");
		map.put("Usa", "Washington dc");
		
		
		System.out.println(map.get("India"));//if we pass the key it will print value attached to that particular key 
		
		
		System.out.println("_____________");
		//Iterating hashmap 
		Iterator<String> it=map.keySet().iterator(); //we need to use keyset method to iterate a hashmap
		while(it.hasNext()) 
		{
			String Key = it.next();//to print only the keys 
		//	System.out.println(Key);
			
			String value = map.get(Key);
			
			System.out.println("Key is " + Key + "Value is " + value);
		}
		System.out.println("---------");
		//iterator using set pair entryset
		Iterator<Entry<String,String>> it2=map.entrySet().iterator(); //entryset will return both key and value pair 
		
		while(it2.hasNext()) 
		{
			Entry <String,String> entry =it2.next();
			System.out.println("Key is  " + entry.getKey() + "Value is  " + entry.getValue()); //get key will return the key and get value will return the value 
		}
		System.out.println("---------");
		//iterating using for each and lamda expression
		map.forEach((k,v) -> System.out.println("Key " + k + "Value is " + v));
		
		Iterator<String> it1=map.keySet().iterator();
		while(it1.hasNext()) 
		{
			String key=it1.next();
			String value =map.get(key);
	
		
		}
		
		
		Iterator<Entry<String,String>> ent =map.entrySet().iterator();
		while(ent.hasNext()) 
		{
			Entry<String,String>entry =ent.next();
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		
		//synchronised hashmap
		
		HashMap<String , String > map4 = new HashMap<String , String>();
		
		            map4.put("A", "Parth");
		            map4.put("B", "Abcd");
		            map4.put("c", "Abcde");
		            
		          Map<String, String> Syncmap = Collections.synchronizedMap(map4);
		          
		          System.out.println(Syncmap);
		          
		          //Concurrent HashMap 
		          ConcurrentHashMap<String , String > map5 = new ConcurrentHashMap<String , String>();
		          map5.put("A", "Parth");
		            map5.put("B", "Abcd");
		            map5.put("c", "Abcde");
		            System.out.println(map5.get("A"));
		            
		            
		            
		            //converting hashmap into an arraylist 
		            
		            HashMap<String , Integer> hash1 =  new HashMap<String, Integer>();
		            hash1.put("Abcd", 1);
		            hash1.put("bcd", 2);
		            hash1.put("cde", 3);
		            
		            
		           Iterator<String> itt =hash1.keySet().iterator();
		           while(itt.hasNext()) 
		           {
		        	   String key1 = itt.next();
		        	   Integer value1 = hash1.get(key1) ;
		        	   System.out.println(key1 + value1);
		           }
		           
		           ArrayList<String> convert = new ArrayList<String>(hash1.keySet());
		           
		           Iterator<String> array =convert.iterator();
		           while(array.hasNext()) 
		           {
		        	   
		        	   System.out.println("Keys are " + array.next());
		           }
		           
		           ArrayList<Integer> convertvalues = new ArrayList<Integer>(hash1.values());
		           
		           Iterator con=convertvalues.iterator();
		           
		           while(con.hasNext()) {
		        	   System.out.println("Values are " + con.next());
		           }
		           
		         
		            
		           
	}
	

	
	
}
