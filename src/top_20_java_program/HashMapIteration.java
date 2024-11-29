package top_20_java_program;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
		 

	    // Main driver method

	    public static void main(String[] arguments)

	    {

	        // Creating Hash map

	        Map<Integer, String> intType

	            = new HashMap<Integer, String>();
	 

	        // Inserting data(Key-value pairs) in hashmap

	        intType.put(1, "First");

	        intType.put(2, "Second");

	        intType.put(3, "Third");

	        intType.put(4, "Fourth");
	 

	        // Iterator

	       /* Iterator<Map.Entry<Integer, String> > new_Iterator

	            = intType.entrySet().iterator();
	 

	        // Iterating every set of entry in the HashMap

	        while (new_Iterator.hasNext()) {

	            Map.Entry<Integer, String> new_Map

	                = (Map.Entry<Integer, String>)

	                      new_Iterator.next();
	 

	            // Displaying HashMap

	            System.out.println(new_Map.getKey() + " = "

	                               + new_Map.getValue());
	        

	        }*/
	        for(Map.Entry<Integer,String> entry:intType.entrySet()) {
	        	System.out.println(entry.getKey() + " = "

	                               + entry.getValue());
	        }

	    }
	}
