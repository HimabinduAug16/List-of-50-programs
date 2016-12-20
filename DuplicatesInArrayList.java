package collections;

import java.util.ArrayList;

import java.util.HashSet;

public class DuplicatesInArrayList {


	public static void main(String [] args){
		ArrayList<String> al = new ArrayList<String>();
	    
		  al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("A");
	      al.add("E");
	      al.add("P");
	      al.add("C");
	      
	      System.out.println("Elements in ArrayList al: " +al);
	      System.out.println("The duplicates are printed below as:");
        HashSet<String> set = new HashSet<String> ();
      
        for(String duplicates: al)
        {
        	if(!set.add(duplicates))
        	{
       
        		System.out.println(duplicates.toString());
        		
        	}
        	
      }
}
}