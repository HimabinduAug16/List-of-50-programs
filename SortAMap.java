package collections;


import java.util.HashMap;

import java.util.TreeMap;


public class SortAMap {

	public static void main (String [] args){
		
		
	// declare hash map
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
	    hm.put(2, "h");
	    hm.put(4, "i");
	    hm.put(6, "m");
	    hm.put(8, "a");
	    hm.put(7, "b");
	    hm.put(5, "i");
	    hm.put(3, "n");
	    hm.put(1, "d");
	    hm.put(9, "u");
	System.out.println("Sorted map");
	TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
	System.out.println(tm);
	
	}
	
	
	
	}


